package com.navin.springbootwebtutorial.springbootwebtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebTutorialApplication implements CommandLineRunner {

    @Autowired
    Apple apple1;

    @Autowired
    private DBService db;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebTutorialApplication.class, args);
	}

    @Override
    public void run(String... args){
        apple1.eatApple();
        db.getDB();
    }
}
