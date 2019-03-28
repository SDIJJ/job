package com.lyf.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


public class MailUtils {
    /**
     * @param to      接收者
     * @param test   发送内容
     * @return
     */


    public static SimpleMailMessage sendMail(JavaMailSender jms,String to, String test) {
        System.out.println("#################邮箱模块已经启动");
        // JavaMailSender jms=new JavaMailSenderImpl();


            //建立邮件消息
            SimpleMailMessage mainMessage = new SimpleMailMessage();
            //发送者
            mainMessage.setFrom("15765539672@163.com");
            //接收者
            mainMessage.setTo(to);
            //发送的标题
            mainMessage.setSubject("来自Job的激活邮件");
            //发送的内容
            mainMessage.setText(test);
        try {
            jms.send(mainMessage);

        }catch (Exception e){
            System.out.println("邮件发送失败");
        }
        return mainMessage;

    }

}
