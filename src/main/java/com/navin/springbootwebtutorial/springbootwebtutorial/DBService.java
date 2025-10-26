package com.navin.springbootwebtutorial.springbootwebtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private DB db;

    void getDB(){
        db.getData();
    }
}
