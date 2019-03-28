package com.lyf.mapper;

import com.lyf.model.Company;
import com.lyf.model.Resume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResumeMapperTest {
    @Autowired
    ResumeMapper resumeMapper;
    @Test
    public void selectResumeByCid() {
        List<Resume> resumes=resumeMapper.selectResumeByCid(1);
        for (Resume r:resumes
             ) {
            System.out.println(r.getName());
        }
    }
    @Test
    public void testSelectRusumeWithCompany(){
        Resume resume=resumeMapper.selectResumeWithCompany(6);
        for (Company c:resume.getCompanies()
             ) {
            System.out.println("=================");
            System.out.println(c);

        }
    }
}