package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
//@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulDemoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulDemoApplication.class);
    }
}
