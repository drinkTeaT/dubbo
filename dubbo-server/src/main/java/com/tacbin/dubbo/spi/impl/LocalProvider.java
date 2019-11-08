package com.tacbin.dubbo.spi.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tacbin.dubbo.provider.ILocalProvider;
import com.tacbin.dubbo.provider.IMyService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description :
 * @Author : Administrator
 * @Date : 2019-11-07 22:43
 **/
@Service
public class LocalProvider implements ILocalProvider {
    @Autowired
    MyServiceImp service;

    @Override
    public String stealHelloWorld() {
        return "steal " + service.helloWorld();
    }
}
