package com.lyf.controller;

import com.lyf.model.User;
import com.lyf.service.UserServiceImp;
import com.lyf.utils.MD5Test;
import com.lyf.utils.MailUtils;
import com.lyf.utils.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by fangjiejie on 2018/6/27.
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;
    @Autowired
    JavaMailSender javaMailSender;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseEntity<User> login(@RequestBody User user, HttpSession httpSession){
       System.out.println("ddd");
        User u=userServiceImp.login(user.getUsername(),MD5Test.GetMD5Code(user.getPassword()));
        if(u!=null){
            httpSession.setAttribute("user",u);
            return new ResponseEntity<User>(u, HttpStatus.OK);
        }else{
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public ResponseEntity<Void> register(@RequestBody User user){
        user.setPassword(MD5Test.GetMD5Code(user.getPassword()));
        userServiceImp.register(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public ResponseEntity<User> getUser(HttpSession httpSession){
        User u=(User)httpSession.getAttribute("user");
        if(u!=null){
            return new ResponseEntity<User>(u, HttpStatus.OK);
        }else{
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
    //用户名重复检验
    @GetMapping("verify/{username}")
    public ResponseEntity<Void> verify(@PathVariable String username){
        System.out.println("###########+这里是用户名重复检查"+username);
        if(userServiceImp.selectByUsername(username)==null){
            return new ResponseEntity<Void>(HttpStatus.OK);
        }else{
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
    //邮箱发送验证码
    @GetMapping("sendCode/{mail}")
    public ResponseEntity<String> verificationCode(@PathVariable String mail){
        String mailCom = mail + ".com";
        String code = RandomNumber.getRandom6();
        String content = "你的验证码为：" + code;
       MailUtils.sendMail(javaMailSender,mailCom,content);
       return new ResponseEntity<String>(code,HttpStatus.OK);
    }
    //检测邮箱是否重复
    @GetMapping("verifyMail/{mail}")
    public ResponseEntity<Void> verifyMail(@PathVariable String mail){
        System.out.println("###########+这里是邮箱重复检查"+mail);
        String remail=mail+".com";
        if(userServiceImp.selectByMail(remail)==null){
            return new ResponseEntity<Void>(HttpStatus.OK);
        }else{
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
}
