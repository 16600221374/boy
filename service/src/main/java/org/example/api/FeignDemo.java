package org.example.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service")
public interface FeignDemo {

    @RequestMapping("/red")
    public String getString();
}
