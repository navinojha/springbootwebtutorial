package com.navin.springbootwebtutorial.springbootwebtutorial;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppleConfig {

    @Bean
    Apple getApple() {
        return new Apple();
    }

    @PostConstruct
    void initializingAppleClass() {
        System.out.println("Initializing the apple class with the necessary parameters");
    }

    @PreDestroy
    void callingMethodForDestroying() {
        System.out.println("Calling cleanup method before destroying it");
    }
}
