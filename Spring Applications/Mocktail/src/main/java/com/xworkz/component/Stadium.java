package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stadium {

    @Autowired
    private double budget;
    public Stadium(){
        System.out.println("stadium object is created");
    }
}
