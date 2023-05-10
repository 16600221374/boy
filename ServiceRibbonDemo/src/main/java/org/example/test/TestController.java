package org.example.test;

import org.example.serviceapi.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon/test")
public class TestController {


    @Qualifier("org.example.serviceapi.ServiceApi")
    @Autowired
    public ServiceApi feignDemo;


    @RequestMapping("/getString")
    public String getString() {
        System.out.println("这个完成了");
        return feignDemo.getString();
    }
}
