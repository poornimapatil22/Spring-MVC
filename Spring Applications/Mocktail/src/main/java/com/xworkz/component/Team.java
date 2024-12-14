package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Team {

    @Autowired
    private String teamName;

    public Team(){
        System.out.println("team name object is created");
    }
}
