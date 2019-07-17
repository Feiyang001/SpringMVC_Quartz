package com.guohui.springMVC.controller;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("myBean")
public class MyBean {

    public void printMessage(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前的时间是："+simpleDateFormat.format(date));
        System.out.println("MyBean execute" + simpleDateFormat.format(date));
    }
}
