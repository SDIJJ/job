package com.lyf.controller;

import com.lyf.model.*;
import com.lyf.service.CompanyServiceImp;
import com.lyf.service.PeopleFindServiceImp;
import com.lyf.service.ResumeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by fangjiejie on 2018/7/5.
 */
@RestController
@CrossOrigin
@RequestMapping("/peopleFind")
public class PeopleFindController {
    @Autowired
    PeopleFindServiceImp peopleFindServiceImp;
    @Autowired
    ResumeServiceImp resumeServiceImp;
    @Autowired
    CompanyServiceImp companyServiceImp;
    @RequestMapping(value = "/updatePeopleFind",method = RequestMethod.POST)
    public ResponseEntity<String> findPeople(@RequestParam("xueli") String xuelis[], @RequestParam("xueliscore") String xueliscores[], @RequestParam("xueliweight") String xueliWeight, @RequestParam("workexpweight") String workexpWeight, @RequestParam("workexp") String workexps[], @RequestParam("workexpscore") String workexpscores[], HttpSession httpSession){
        User user=(User)httpSession.getAttribute("user");
        Peopleintension peopleintension=peopleFindServiceImp.findPeopleIntensionByAid(user.getUid());
        if(peopleintension==null){
            peopleintension=new Peopleintension();
        }
        peopleintension.setAid(user.getUid());
        peopleintension.setWorkexpweight(Integer.parseInt(workexpWeight));
        peopleintension.setXueliweight(Integer.parseInt(xueliWeight));
        peopleFindServiceImp.updatePeopleIntension(peopleintension);
        peopleintension=peopleFindServiceImp.findPeopleIntensionByAid(user.getUid());
        peopleFindServiceImp.deleteXueliPeopleIntensionByPid(peopleintension.getPid());
        for(int i=0;i<xuelis.length;i++){
            Xuelipeopleintension xuelipeopleintension=new Xuelipeopleintension();
            xuelipeopleintension.setXueliname(xuelis[i]);
            xuelipeopleintension.setXueliscore(Integer.parseInt(xueliscores[i]));
            xuelipeopleintension.setPid(peopleintension.getPid());
            peopleFindServiceImp.addXueliPeopleIntension(xuelipeopleintension);
        }
        peopleFindServiceImp.deleteWorkexpPeopleIntensionByPid(peopleintension.getPid());
        for(int i=0;i<workexps.length;i++){
            Workexppeopleintension workexppeopleintension=new Workexppeopleintension();
            workexppeopleintension.setWorkexp(workexps[i]);
            workexppeopleintension.setPlacescore(Integer.parseInt(workexpscores[i]));
            workexppeopleintension.setPid(peopleintension.getPid());
            peopleFindServiceImp.addWorkexpPeopleIntension(workexppeopleintension);
        }

        return new ResponseEntity<String>("可以点击人才推荐查看啦",HttpStatus.OK);
    }
    @RequestMapping(value = "/resumes",method = RequestMethod.POST)
    public ResponseEntity<List<Resume>> getResumes(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        Peopleintension peopleintension = peopleFindServiceImp.findPeopleIntensionByAid(user.getUid());
        if (peopleintension == null) {
            return new ResponseEntity<List<Resume>>(HttpStatus.CONFLICT);
        }
        List<Xuelipeopleintension> xlist = peopleFindServiceImp.findXuelipeopleIntensionByPid(peopleintension.getPid());
        List<Workexppeopleintension> wlist = peopleFindServiceImp.findWorkexppeopleIntensionByPid(peopleintension.getPid());
        Company company = companyServiceImp.findCompanyByUid(user.getUid());
        String postion = company.getPosition();
        List<Resume> list = resumeServiceImp.getAllResumes();
        Iterator<Resume> iterator = list.iterator();
        Resume tmpR;
        while (iterator.hasNext()) {
            tmpR = iterator.next();
            if (tmpR.getPosition().equals(postion)) {
                Iterator<Xuelipeopleintension> xit = xlist.iterator();
                while (xit.hasNext()) {
                    Xuelipeopleintension xuelipeopleintension = xit.next();
                    if (tmpR.getXueli().equals(xuelipeopleintension.getXueliname())) {
                        tmpR.setRole(String.valueOf(Integer.parseInt(tmpR.getRole()) + xuelipeopleintension.getXueliscore() * peopleintension.getXueliweight()));
                    }
                }
                Iterator<Workexppeopleintension> wit = wlist.iterator();
                while (wit.hasNext()) {
                    Workexppeopleintension workexppeopleintension = wit.next();
                    if (tmpR.getWorkexp().equals(workexppeopleintension.getWorkexp())) {
                        tmpR.setRole(String.valueOf(Integer.parseInt(tmpR.getRole()) + workexppeopleintension.getPlacescore() * peopleintension.getWorkexpweight()));
                    }
                }
            }
        }
            Collections.sort(list, new Comparator<Resume>() {
                @Override
                public int compare(Resume o1, Resume o2) {
                    return Integer.parseInt(o2.getRole()) - Integer.parseInt(o1.getRole());
                }
            });
        return new ResponseEntity<List<Resume>>(list,HttpStatus.OK);
    }
    @RequestMapping(value = "/getPeopleIntension",method = RequestMethod.POST)
    public ResponseEntity<HashMap<String,Object>> getPeopleIntension(HttpSession httpSession){
        User user=(User)httpSession.getAttribute("user");
        Peopleintension peopleintension=peopleFindServiceImp.findPeopleIntensionByAid(user.getUid());

        if(peopleintension==null){
            return new ResponseEntity<HashMap<String, Object>>(HttpStatus.CONFLICT);
        }
        List<Xuelipeopleintension> xlist=peopleFindServiceImp.findXuelipeopleIntensionByPid(peopleintension.getPid());
        List<Workexppeopleintension> wlist=peopleFindServiceImp.findWorkexppeopleIntensionByPid(peopleintension.getPid());
        HashMap<String,Object> hashMap=new HashMap<>();
        hashMap.put("peopleIntension",peopleintension);
        hashMap.put("wlist",wlist);
        hashMap.put("xlist",xlist);
        return new ResponseEntity<HashMap<String, Object>>(hashMap,HttpStatus.OK);
    }
    @RequestMapping(value = "/getResumeByRid/{rid}",method = RequestMethod.POST)
    public ResponseEntity<Resume> getResumeByCid(@PathVariable Integer rid){
        Resume resume=resumeServiceImp.findResumeByRid(rid);
        return new ResponseEntity<Resume>(resume,HttpStatus.OK);
    }


}
