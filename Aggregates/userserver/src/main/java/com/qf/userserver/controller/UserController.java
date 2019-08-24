package com.qf.userserver.controller;

import com.qf.userserver.entity.User;
import com.qf.userserver.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/register")
    public String register(User user){

        System.out.println(userService.registerUser(user));
        return userService.registerUser(user)+"";
    }
    @GetMapping("/login")
    public String login(User user){
        return userService.checkLogin(user)+"";
    }


}
