package com.example.polymerization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PolymerizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolymerizationApplication.class, args);
    }

}
