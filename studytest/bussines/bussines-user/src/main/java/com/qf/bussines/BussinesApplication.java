package com.qf.bussines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName BussinesApplication
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/9/17
 * @Version V1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class BussinesApplication {
    public static void main(String[] args) {
        SpringApplication.run(BussinesApplication.class,args);
    }
}
