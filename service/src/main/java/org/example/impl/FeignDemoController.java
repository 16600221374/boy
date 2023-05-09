package org.example.impl;

import org.example.api.FeignDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()
@RestController
public class FeignDemoController implements FeignDemo {

    @Override
    @RequestMapping("/red")
    public String getString(){
        return "???";
    }
}
