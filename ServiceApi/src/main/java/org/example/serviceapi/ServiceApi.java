package org.example.serviceapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service")
public interface ServiceApi {

    @RequestMapping("/red")
    public String getString();
}
