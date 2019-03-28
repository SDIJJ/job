package com.lyf.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class mailTest {

   @Autowired
   JavaMailSender javaMailSender;
    @Test
    public void sendMail(){
      String to="13763799346@163.com";
      String content="来自Job的注册邮件";
      MailUtils.sendMail(javaMailSender,to,content);
    }
}
