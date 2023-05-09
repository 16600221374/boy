package org.example.test;

import org.example.api.FeignDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon/test")
public class TestController {

    @Qualifier("org.example.api.FeignDemo")
    @Autowired
    public FeignDemo feignDemo;


    @RequestMapping("/getString")
    public String getString(){
        System.out.println("这个完成了");
        return feignDemo.getString();
    }
}
