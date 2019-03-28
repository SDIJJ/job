package com.lyf.service;

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
public class CompanyServiceImpTest {
   @Autowired
   CompanyServiceImp companyServiceImp;
    @Test
    public void findResumeWithCompany() {
        List<Resume> resumeList=companyServiceImp.findResumeWithCompany(1).getResumes();
        System.out.println("=============");
    }
}