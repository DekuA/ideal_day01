package com.lxm.ideal.day01.ideal_day01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("qqq")
    public String selll(){
        return "卢自然";
    }
}
