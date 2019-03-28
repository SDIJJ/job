package com.lyf.service;

import com.lyf.mapper.UserMapper;

import com.lyf.model.User;
import com.lyf.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fangjiejie on 2018/6/27.
 */
@Service
public class UserServiceImp {
    @Autowired
    private UserMapper userMapper;
    public User login(String username, String password){
        return  userMapper.login(username,password);
    }
    public void register(User user){
        userMapper.insert(user);
    }
    //根据用户名查询用户
    public User selectByUsername(String username){
        System.out.println("########此处有问题？？？？？？");
        UserExample example=new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        System.out.println("##################bug2号");
        return userMapper.selectByExample(example);
    }
    //根据邮箱查询用户
    public User selectByMail(String mail){
        UserExample example=new UserExample();
        example.createCriteria().andMailEqualTo(mail);
         return userMapper.selectByExample(example) ;
    }
}
