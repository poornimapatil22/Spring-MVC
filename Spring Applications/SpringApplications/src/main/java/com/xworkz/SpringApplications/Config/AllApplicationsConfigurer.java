package com.xworkz.SpringApplications.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.SpringApplications")
public class AllApplicationsConfigurer {
    public AllApplicationsConfigurer(){
        System.out.println("const of configurer");
    }
}
