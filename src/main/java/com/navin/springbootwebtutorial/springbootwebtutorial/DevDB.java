package com.navin.springbootwebtutorial.springbootwebtutorial;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
public class DevDB implements DB {
    @Override
    public void getData() {
        System.out.println("Dev Data is being fetched");
    }
}
