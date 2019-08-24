package com.qf.userserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.qf.userserver.dao")
public class UserserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserverApplication.class, args);
    }

}
