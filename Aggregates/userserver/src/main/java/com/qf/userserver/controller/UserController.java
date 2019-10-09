package com.qf.userserver.controller;

import com.qf.userserver.service.impl.UserServiceImpl;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    String register(@RequestBody User user){
        if (userService.registerUser(user)>0){
            return "注册成功";
        }else {
            return "注册失败";
        }
    }
    @RequestMapping("/login")
    public String login(User user){
        if (userService.checkLogin(user) != null){
            return "登录成功";
        }else {
            return "登陆失败";
        }
    }
        @RequestMapping("/test")
        public String testwg(){
            return "网关测试成功";
        }


}
