package com.qf.bussines.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/9/17
 * @Version V1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/m")
    public String sayHi()
    {
        System.out.println("草拟马");
        return "孤儿龙";
    }
}
