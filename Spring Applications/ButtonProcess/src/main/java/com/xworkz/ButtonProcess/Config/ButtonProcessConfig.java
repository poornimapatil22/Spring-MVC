package com.xworkz.ButtonProcess.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.ButtonProcess")
public class ButtonProcessConfig  {
    public ButtonProcessConfig(){
        System.out.println("const of config class");
    }


}
