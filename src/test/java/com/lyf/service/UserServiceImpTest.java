package com.lyf.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImpTest {
   @Autowired
   private UserServiceImp userServiceImp;
    @Test
    public void login() {
    }

    @Test
    public void register() {
    }

    @Test
    public void selectByUsername() {
        userServiceImp.selectByUsername("聪聪");
    }

    @Test
    public void selectByMail() {
    }
}