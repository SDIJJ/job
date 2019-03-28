package com.lyf.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MD5TestTest {

    @Test
    public void getMD5Code() {
        System.out.println(MD5Test.GetMD5Code("1769105723jhn"));


    }
}