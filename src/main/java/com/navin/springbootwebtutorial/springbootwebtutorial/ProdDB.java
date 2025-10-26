package com.navin.springbootwebtutorial.springbootwebtutorial;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "production")
public class ProdDB implements DB {
    @Override
    public void getData() {
        System.out.println("Prod data is being fetched");
    }
}
