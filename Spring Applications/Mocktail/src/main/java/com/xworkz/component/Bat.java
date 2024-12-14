package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bat {
    @Autowired
private double batCost;
    public Bat(){
        System.out.println("bat object is created");
    }
}
