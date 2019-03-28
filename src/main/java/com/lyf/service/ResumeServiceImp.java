package com.lyf.service;

import com.lyf.mapper.CompanyResumeMapper;
import com.lyf.mapper.ResumeMapper;
import com.lyf.model.CompanyResume;
import com.lyf.model.Resume;
import com.lyf.model.ResumeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fangjiejie on 2018/6/28.
 */
@Service
public class ResumeServiceImp {
    @Autowired
    ResumeMapper resumeMapper;



    public Resume updateResume(Resume resume) {
        if (resume.getRid() == null) {
            resumeMapper.insert(resume);
        } else {
            resumeMapper.updateByPrimaryKey(resume);
        }
        return resume;
    }

    public Resume findResumeByUid(int uid) {
        return resumeMapper.selectByUid(uid);
    }

    public Resume findResumeByRid(int rid) {
        return resumeMapper.selectByPrimaryKey(rid);
    }

    public List<Resume> getAllResumes() {
        ResumeExample resumeExample = new ResumeExample();
        resumeExample.createCriteria().andRidIsNotNull();
        return resumeMapper.selectByExample(resumeExample);
    }

    //返回的是Resume带有所有该简历所投递的过的公司
    public Resume findResumeWithCompany(Integer rid) {
        return resumeMapper.selectResumeWithCompany(rid);
    }



}
