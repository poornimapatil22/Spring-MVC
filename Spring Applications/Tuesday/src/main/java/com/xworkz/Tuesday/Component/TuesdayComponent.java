package com.xworkz.Tuesday.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Component
public class TuesdayComponent {
    public TuesdayComponent(){
        System.out.println("no-arg const in Tuesday Component");
    }


    @RequestMapping("/next")
    public String NextDay(){
        System.out.println("A request mapper for NextDay");
        return "index.jsp";
    }
}
