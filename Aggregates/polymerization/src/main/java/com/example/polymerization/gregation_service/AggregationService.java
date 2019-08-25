package com.example.polymerization.gregation_service;

import entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "service-user")
public interface AggregationService {

    @RequestMapping(value = "/user/login")
    User checkLogin( User user);

    @RequestMapping(value = "/user/register")
    int registerUser(User user);
}
