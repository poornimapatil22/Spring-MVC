package com.xworkz.Component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lock {


    @Autowired
    @Qualifier("lockType")
    private String name;



    @Autowired
    @Qualifier("car")
    private Vehicle vehicle;


    public Lock() {
        System.out.println("Created no-arg const of Lock");
    }


}
