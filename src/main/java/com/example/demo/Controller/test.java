package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("test")
public class test {
    @ResponseBody
    @RequestMapping("/smn")
    public String test1(){
        return "testsmn发发发发发";
    }
}
