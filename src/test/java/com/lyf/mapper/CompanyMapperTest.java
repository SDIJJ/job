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
public class CompanyMapperTest {
    @Autowired
    private CompanyMapper companyMapper;

    @Test
    public void selectCompanyWithResuem() {
        Company company=companyMapper.selectCompanyWithResuem(1);
        System.out.println(company);
        System.out.println("==========");
        for (Resume r:company.getResumes()
             ) {
            System.out.println("-----------------");
            System.out.println(r);
            System.out.println("-----------------");
        }
    }
    @Test
    public void selectCompanyByRid(){
        List<Company> companyList=companyMapper.selectCompanyByRid(6);
        for (Company c:companyList
             ) {
            System.out.println(c);
        }

    }
}