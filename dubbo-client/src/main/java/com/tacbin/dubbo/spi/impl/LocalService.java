package com.tacbin.dubbo.spi.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tacbin.dubbo.provider.ILocalProvider;
import org.springframework.stereotype.Service;

/**
 * @Description : 本地引用服务
 * @Author : Administrator
 * @Date : 2019-11-07 22:48
 **/
@Service
public class LocalService {
    @Reference
    ILocalProvider localProvider;

    public String helloWorld() {
        return localProvider.stealHelloWorld();
    }
}
