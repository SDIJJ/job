package com.lyf.service;

import com.lyf.mapper.CompanyMapper;
import com.lyf.model.Company;
import com.lyf.model.CompanyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fangjiejie on 2018/7/3.
 */
@Service
public class CompanyServiceImp {
    @Autowired
    CompanyMapper companyMapper;
    public Company updateCompany(Company company){
        if(company.getCid()==null){
            companyMapper.insert(company);
        }else{
            companyMapper.updateByPrimaryKey(company);
        }
        return company;
    }
    public Company findCompanyByCid(int cid){
        return companyMapper.selectByCid(cid);
    }
    public Company findCompanyByUid(int uid){
        return companyMapper.selectByUid(uid);
    }
    public List<Company> getAllCompanys(){
        CompanyExample companyExample=new CompanyExample();
        companyExample.createCriteria().andCidIsNotNull();
        return companyMapper.selectByExample(companyExample);
    }
    //返回的是Company带有所有投递该公司的Resume
    public Company findResumeWithCompany(Integer cid){
        return companyMapper.selectCompanyWithResuem(cid);

    }
}
