package com.lyf.service;

import com.lyf.model.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResumeServiceImpTest {
   @Autowired
   ResumeServiceImp resumeServiceImp;
    @Test
    public void findResumeWithCompany() {
        List<Company> companyList=resumeServiceImp.findResumeWithCompany(6).getCompanies();
        System.out.println("=================");
    }
}