package com.tacbin.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tacbin.dubbo.serviceimp.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : Administrator
 * @Date : 2019-10-31 22:36
 **/
@RestController
public class TestController {
    @Autowired
    RemoteService service;

    @RequestMapping("/")
    public String remoteService() {
        return service.helloWorld();
    }
}
