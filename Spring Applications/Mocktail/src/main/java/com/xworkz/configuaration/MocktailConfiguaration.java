package com.xworkz.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class MocktailConfiguaration {
    MocktailConfiguaration(){
        System.out.println("config object is created");
    }



    @Bean
    public String teamName(){
        System.out.println("team name exist");
        return "RCB";
    }

    @Bean
    public double budget(){
        System.out.println("budget exist");
        return 2300000;
    }

    @Bean
    public String ownerName(){
        System.out.println("ownername exist");
        String ownerName=new String("Vijay Mallya");
        return ownerName;
    }

    @Bean
    public double batCost(){
        System.out.println("bat cost exist");
        double batCost=500;
        return batCost;
    }

    @Bean
    public double ballCost(){
        System.out.println("ball cost exist");
        return 200;
    }
}
