package com.khanh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GreetingService greetingService() {

        GreetingService greetingService =
                new GreetingService();

        greetingService.setMessage(
                "Hello, Spring Java Configuration!"
        );

        return greetingService;
    }
}