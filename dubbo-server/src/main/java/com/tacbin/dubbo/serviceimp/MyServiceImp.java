package com.tacbin.dubbo.serviceimp;

import com.alibaba.dubbo.config.annotation.Service;
import com.tacbin.dubbo.service.IMyService;

/**
 * @Description : 被暴露接口的实现类
 * @Author : Administrator
 * @Date : 2019-10-31 22:06
 **/
@Service
public class MyServiceImp implements IMyService {
    @Override
    public String helloWorld() {
        System.out.println("我被调用了");
        return "hello world";
    }
}
