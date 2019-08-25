package com.example.polymerization.gregation_controller;

import entity.User;
import com.example.polymerization.gregation_service.AggregationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class GregationController {
    @Autowired
    private AggregationService aggregationService;
    @RequestMapping("/register")
    public String registerUser(User user){
        System.out.println("爱你"+user);
        if (aggregationService.registerUser(user) >0){
            return "注册成功。。。";
        }return "注册失败。。。";
    }
    @RequestMapping("/login")
    public String loginUser(User user){
        if (aggregationService.checkLogin(user) !=null){
            return "登录成功。。。";
        }else {
            return "登录失败。。。";
        }
    }
}
