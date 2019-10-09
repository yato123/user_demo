package com.qf.bussines.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OderController
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/9/18
 * @Version V1.0
 **/
@RestController
@RequestMapping("oder")
public class OderController {
    @GetMapping("o")
    public String show(){
        return "成功";
    }
}
