package com.tacbin.dubbo.spi.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tacbin.dubbo.provider.ILocalProvider;
import com.tacbin.dubbo.provider.IMyService;
import org.springframework.stereotype.Service;

/**
 * @Description :
 * @Author : Administrator
 * @Date : 2019-11-08 0:01
 **/
@Service
public class MiddleService {
    @Reference
    IMyService service;

    String stealHelloWorld(){
        return service.helloWorld();
    }
}
