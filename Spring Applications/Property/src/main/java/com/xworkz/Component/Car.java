package com.xworkz.Component;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Car implements Vehicle {

    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String hidden;

    @PostConstruct
    public void postCreation()
    {
        System.out.println("UserName :" +this.userName);
        System.out.println("hidden :"+this.hidden);
    }
    public Car() {
        System.out.println("Created no-arg const of Car");
    }

    @Override
    public int minPrice() {
        System.out.println("running minPrice");
        return 300000;
    }

    @Override
    public int maxPrice() {
        System.out.println("running maxPrice");
        return 500000;
    }
}
