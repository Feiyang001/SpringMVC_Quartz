package com.guohui.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("login")
    private @ResponseBody String login(@RequestParam(value = "username",required = false)String username,
                                       @RequestParam(value = "password",required = false)String password){
        return "hello : "+username+"your password is :"+password;
    }
}
