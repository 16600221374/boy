package org.example.api;

import org.example.config.FeignLogConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service",configuration = FeignLogConfig.class)
public interface FeignDemo {

    @RequestMapping("/red")
    public String getString();
}
