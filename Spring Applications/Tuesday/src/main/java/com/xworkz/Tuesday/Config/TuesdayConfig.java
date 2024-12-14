package com.xworkz.Tuesday.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Tuesday")
public class TuesdayConfig {

    public TuesdayConfig(){
        System.out.println("no-arg const in tuesday config");
    }

}
