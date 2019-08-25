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
    int register(@RequestBody User user){
        System.out.println("草拟"+user);
        return userService.registerUser(user);
    }
    @RequestMapping("/login")
    public User login(User user){
        return userService.checkLogin(user);
    }


}
