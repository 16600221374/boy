package org.example.impl;

import org.example.serviceapi.ServiceApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()
@RestController
public class FeignDemoController implements ServiceApi {

    @Override
    @RequestMapping("/red")
    public String getString(){
        return "Service";
    }
}
