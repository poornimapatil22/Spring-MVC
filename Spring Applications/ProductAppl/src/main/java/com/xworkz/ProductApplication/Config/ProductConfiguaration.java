package com.xworkz.ProductApplication.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.ProductApplication")
public class ProductConfiguaration {
    ProductConfiguaration(){
        System.out.println("const of config");
    }
}
