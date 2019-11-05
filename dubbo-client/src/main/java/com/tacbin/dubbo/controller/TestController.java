package com.tacbin.dubbo.controller;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.sun.xml.internal.bind.v2.model.core.ID;
import com.tacbin.dubbo.spi.IDubboInsertHelloWorld;
import com.tacbin.dubbo.spi.IDubboSpiService;
import com.tacbin.dubbo.spi.ISpiService;
import com.tacbin.dubbo.spi.impl.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ServiceLoader;

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

    @RequestMapping("/spi")
    public String spiTest() {
        ServiceLoader<ISpiService> spiServices = ServiceLoader.load(ISpiService.class);
        String value = "";
        for (ISpiService service : spiServices) {
            value += service.spiTest();
        }
        return value;
    }

    @RequestMapping("/dubboSpi")
    public String dubboSpi() {
        IDubboSpiService spiService = ExtensionLoader.getExtensionLoader(IDubboSpiService.class).getExtension("impl");
        return spiService.spiTest();
    }

    @RequestMapping("/autoWrapper")
    public String autoWrapper(){
        IDubboInsertHelloWorld helloWorld = ExtensionLoader.getExtensionLoader(IDubboInsertHelloWorld.class).getExtension("impl");
        return helloWorld.getHelloWorld();
    }
}
