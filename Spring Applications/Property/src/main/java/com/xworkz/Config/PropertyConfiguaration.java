package com.xworkz.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xworkz")
@PropertySource("classpath:pro.properties")

public class PropertyConfiguaration {


    public PropertyConfiguaration() {
        System.out.println("Created KeyConfiguration");
    }

    @Bean
    public String lockType() {
        System.out.println("registering lockType with spring");
        return "Knob lock";
    }

    @Bean
    public String brand() {
        System.out.println("registering brand with spring");
        return "Ozone";
    }

    @Bean
    public String anotherLockType() {
        System.out.println("registering anotherLockType with spring");
        return "Deadbolt lock";
    }
}

