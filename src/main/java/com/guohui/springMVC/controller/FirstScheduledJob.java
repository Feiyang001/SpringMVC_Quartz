package com.guohui.springMVC.controller;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstScheduledJob extends QuartzJobBean {


    private AnotherBean anotherBean;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

       //编写业务逻辑
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前的时间是："+simpleDateFormat.format(date));
        System.out.println("FirstScheduledJob execute " + simpleDateFormat.format(date));
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }



}
