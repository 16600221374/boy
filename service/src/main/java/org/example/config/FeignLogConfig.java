package org.example.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignLogConfig {
    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
