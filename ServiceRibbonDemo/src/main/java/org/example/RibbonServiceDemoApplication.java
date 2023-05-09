package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"org.example.*"})
@EnableFeignClients("org.example.*")
public class RibbonServiceDemoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(RibbonServiceDemoApplication.class);
    }
}
