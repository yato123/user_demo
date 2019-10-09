package com.qf.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName GatewayApolication
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/9/18
 * @Version V1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class GatewayApolication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApolication.class,args);
    }
}
