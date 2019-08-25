package com.qf.userserver.service;


import entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


public interface IUserService {
    User findUser(User user);
    User checkLogin( User user);
    int registerUser(User user);
}
