package com.qf.bussines;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "yato",path = "oder")
public interface OderFeign {
    @GetMapping("o")
    String show();

}
