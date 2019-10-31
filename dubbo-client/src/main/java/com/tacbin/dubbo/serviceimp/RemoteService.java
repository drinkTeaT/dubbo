package com.tacbin.dubbo.serviceimp;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tacbin.dubbo.service.IMyService;
import org.springframework.stereotype.Service;

/**
 * @Description :远程服务
 * @Author : Administrator
 * @Date : 2019-10-31 22:22
 **/
@Service
public class RemoteService {
    @Reference
    IMyService service;

    public String helloWorld() {
        return service.helloWorld();
    }
}
