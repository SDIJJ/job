package com.lyf.service;

import com.lyf.mapper.CompanyResumeMapper;
import com.lyf.mapper.JobintensionMapper;
import com.lyf.mapper.PlacejobintensionMapper;
import com.lyf.mapper.TypeJobintensionMapper;
import com.lyf.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fangjiejie on 2018/7/3.
 */
@Service
public class JobFindServiceImp {
    @Autowired
    JobintensionMapper jobintensionMapper;
    @Autowired
    PlacejobintensionMapper placejobintensionMapper;
    @Autowired
    TypeJobintensionMapper typeJobintensionMapper;
    @Autowired
    CompanyResumeMapper companyResumeMapper;
    public Jobintension updateJobIntension(Jobintension jobintension){
        if(jobintension.getJid()==null){
            jobintensionMapper.insert(jobintension);
        }else{
            jobintensionMapper.updateByPrimaryKey(jobintension);
        }
        return jobintension;
    }
    public Jobintension findJobIntensionByAid(int aid){
       return jobintensionMapper.selectByAid(aid);//此处uid建表时写错成了aid;   //我说这个名字怎么这么奇怪
    }
    public void addPlaceJobIntension(Placejobintension placejobintension){
            placejobintensionMapper.insert(placejobintension);
    }
    public List<Placejobintension> findPlaceJobIntensionByJid(int jid){
        PlacejobintensionExample placejobintensionExample=new PlacejobintensionExample();
        placejobintensionExample.createCriteria().andJidEqualTo(jid);
        return placejobintensionMapper.selectByExample(placejobintensionExample);
    }
    public void deletePlaceJobIntensionByJid(int jid){
        PlacejobintensionExample placejobintensionExample=new PlacejobintensionExample();
        placejobintensionExample.createCriteria().andJidEqualTo(jid);
         placejobintensionMapper.deleteByExample(placejobintensionExample);
    }

    public void addTypeJobIntension(TypeJobintension typeJobintension){
        typeJobintensionMapper.insert(typeJobintension);
    }
    public List<TypeJobintension> findTypeJobIntensionByJid(int jid){
        TypeJobintensionExample typeJobintensionExample=new TypeJobintensionExample();
        typeJobintensionExample.createCriteria().andJidEqualTo(jid);
        return typeJobintensionMapper.selectByExample(typeJobintensionExample);
    }
    public void deleteTypeJobIntensionByJid(int jid){
        TypeJobintensionExample typeJobintensionExample=new TypeJobintensionExample();
        typeJobintensionExample.createCriteria().andJidEqualTo(jid);
       typeJobintensionMapper.deleteByExample(typeJobintensionExample);
    }
    /**
     * 求职者投递简历
     * @param companyResume
     * @return
     */
    public CompanyResume updateCompanyResume(CompanyResume companyResume){

        if (companyResume.getId()==null){
            companyResumeMapper.insert(companyResume);
        }else{
            companyResumeMapper.updateByPrimaryKey(companyResume);
        }
        return companyResume;
    }
    //检测是否已经投递过简历
    public boolean  checkCompanyResume(CompanyResume companyResume){
        CompanyResumeExample example=new CompanyResumeExample();
        example.createCriteria().andCompanyIdEqualTo(companyResume.getCompanyId()).andResumeIdEqualTo(companyResume.getResumeId());
       int size= companyResumeMapper.selectByExample(example).size();
        if(size!=0){
            return true;//已经投递过简历了
        }
        else {
            return false;
        }
    }
}
