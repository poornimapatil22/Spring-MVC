package com.xworkz.ButtonProcess.Components;

import com.xworkz.ButtonProcess.Dto.DeathCerticateDto;
import com.xworkz.ButtonProcess.Dto.SchlorshipDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/")
@Component
public class AllComponent {
    public AllComponent(){
        System.out.println("const of AllComponent");
    }


    @RequestMapping(value = "/apply")
    public String apllyToSchlorship( SchlorshipDto schlorshipDto){
        System.out.println("applying schlorship");
        System.out.println(schlorshipDto);
        return "Schlorship.jsp";
    }




}
