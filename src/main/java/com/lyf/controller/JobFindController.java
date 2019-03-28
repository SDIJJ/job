package com.lyf.controller;

import com.lyf.model.*;
import com.lyf.service.CompanyServiceImp;
import com.lyf.service.JobFindServiceImp;
import com.lyf.service.ResumeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by fangjiejie on 2018/7/3.
 */
@RestController
@CrossOrigin
@RequestMapping("/jobFind")
public class JobFindController {
    @Autowired
    ResumeServiceImp resumeServiceImp;
    @Autowired
    JobFindServiceImp jobFindServiceImp;
    @Autowired
    CompanyServiceImp companyServiceImp;

    @RequestMapping(value = "/updateJobFind", method = RequestMethod.POST)
    public ResponseEntity<String> findCompany(@RequestParam("type") String[] types, @RequestParam("typescore") String[] typescores, @RequestParam("typeweight") String typeweight, @RequestParam("place") String[] places, @RequestParam("placescore") String[] placescores, @RequestParam("placeweight") String placeweight, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        Jobintension jobintension = jobFindServiceImp.findJobIntensionByAid(user.getUid());
        if (jobintension == null) {
            jobintension = new Jobintension();
        }
        jobintension.setAid(user.getUid());
        jobintension.setPlaceweight(Integer.parseInt(placeweight));
        jobintension.setTypeweight(Integer.parseInt(typeweight));
        jobFindServiceImp.updateJobIntension(jobintension);
        jobintension = jobFindServiceImp.findJobIntensionByAid(user.getUid());
        jobFindServiceImp.deleteTypeJobIntensionByJid(jobintension.getJid());
        for (int i = 0; i < types.length; i++) {
            TypeJobintension typeJobintension = new TypeJobintension();
            typeJobintension.setTypename(types[i]);
            typeJobintension.setTypescore(Integer.parseInt(typescores[i]));
            typeJobintension.setJid(jobintension.getJid());
            jobFindServiceImp.addTypeJobIntension(typeJobintension);
        }
        jobFindServiceImp.deletePlaceJobIntensionByJid(jobintension.getJid());
        for (int i = 0; i < places.length; i++) {
            Placejobintension placejobintension = new Placejobintension();
            placejobintension.setPlacename(places[i]);
            placejobintension.setPlacescore(Integer.parseInt(placescores[i]));
            placejobintension.setJid(jobintension.getJid());
            jobFindServiceImp.addPlaceJobIntension(placejobintension);
        }

        return new ResponseEntity<String>("可以点击企业推荐查看啦", HttpStatus.OK);
    }

    @RequestMapping(value = "/companys", method = RequestMethod.POST)
    public ResponseEntity<List<Company>> getCompanys(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        System.out.println(user);
        Jobintension jobintension = jobFindServiceImp.findJobIntensionByAid(user.getUid());
        if (jobintension == null) {
            return new ResponseEntity<List<Company>>(HttpStatus.CONFLICT);
        }
        List<TypeJobintension> tlist = jobFindServiceImp.findTypeJobIntensionByJid(jobintension.getJid());
        List<Placejobintension> plist = jobFindServiceImp.findPlaceJobIntensionByJid(jobintension.getJid());
        Resume resume = resumeServiceImp.findResumeByUid(user.getUid());
        String position = resume.getPosition();
        List<Company> list = companyServiceImp.getAllCompanys();
        Iterator<Company> iterator = list.iterator();
        while (iterator.hasNext()) {
            Company tmpC = iterator.next();
            if (tmpC.getPosition().equals(position)) {
                Iterator<TypeJobintension> tit = tlist.iterator();
                while (tit.hasNext()) {
                    TypeJobintension typeJobintension = tit.next();
                    if (tmpC.getTypename().equals(typeJobintension.getTypename())) {
                        tmpC.setOthers((String.valueOf(Integer.parseInt(tmpC.getOthers())
                                + typeJobintension.getTypescore() * jobintension.getTypeweight())));
                    }
                }

                Iterator<Placejobintension> pit = plist.iterator();
                while (pit.hasNext()) {
                    Placejobintension placejobintension = pit.next();
                    if (tmpC.getPlace().equals(placejobintension.getPlacename())) {
                        tmpC.setOthers((String.valueOf(Integer.parseInt(tmpC.getOthers()) + placejobintension.getPlacescore() * jobintension.getPlaceweight())));
                    }
                }
            }
        }
        Collections.sort(list, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return Integer.parseInt(o2.getOthers()) - Integer.parseInt(o1.getOthers());
            }
        });
        return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/allList", method = RequestMethod.POST)
    public ResponseEntity<HashMap<String, Object>> getAllList(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (user.getRole().equals("企业")) {
            hashMap.put("type", "company");
            List<Resume> list = resumeServiceImp.getAllResumes();
            hashMap.put("list", list);
        } else {
            hashMap.put("type", "people");
            List<Company> list = companyServiceImp.getAllCompanys();
            hashMap.put("list", list);
        }
        return new ResponseEntity<HashMap<String, Object>>(hashMap, HttpStatus.OK);
    }

    @RequestMapping(value = "/getJobIntension", method = RequestMethod.POST)
    public ResponseEntity<HashMap<String, Object>> getJobIntension(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        Jobintension jobintension = jobFindServiceImp.findJobIntensionByAid(user.getUid());
        if (jobintension == null) {
            return new ResponseEntity<HashMap<String, Object>>(HttpStatus.CONFLICT);
        }
        List<TypeJobintension> tlist = jobFindServiceImp.findTypeJobIntensionByJid(jobintension.getJid());
        List<Placejobintension> plist = jobFindServiceImp.findPlaceJobIntensionByJid(jobintension.getJid());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("jobIntension", jobintension);
        hashMap.put("tlist", tlist);
        hashMap.put("plist", plist);
        return new ResponseEntity<HashMap<String, Object>>(hashMap, HttpStatus.OK);
    }

    @RequestMapping(value = "/getCompanyByCId/{cid}", method = RequestMethod.POST)
    public ResponseEntity<Company> getCompanyByCid(@PathVariable Integer cid) {
        Company company = companyServiceImp.findCompanyByCid(cid);
        return new ResponseEntity<Company>(company, HttpStatus.OK);
    }
    //向公司投递简历
    @GetMapping("/sendResume/{cid}")
    public ResponseEntity<Void> sendResume(@PathVariable String cid ,HttpSession httpSession){
        System.out.println("##############cid=="+cid);
        User user =(User)httpSession.getAttribute("user");
        int uid=user.getUid();
        System.out.println("##########uid==="+uid);
        Resume r=resumeServiceImp.findResumeByUid(uid);
        int rid=r.getRid();
        int cidd=Integer.parseInt(cid);
        CompanyResume companyResume=new CompanyResume();
        companyResume.setCompanyId(cidd);
        companyResume.setResumeId(rid);
        boolean flag=jobFindServiceImp.checkCompanyResume(companyResume);
        if (flag==true){
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }else {
            jobFindServiceImp.updateCompanyResume(companyResume);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }

    }

}
