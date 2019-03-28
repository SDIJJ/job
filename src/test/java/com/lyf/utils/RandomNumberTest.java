package com.lyf.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomNumberTest {

    @Test
    public void randomTest() {
        String random=RandomNumber.getRandom6();

    }
}