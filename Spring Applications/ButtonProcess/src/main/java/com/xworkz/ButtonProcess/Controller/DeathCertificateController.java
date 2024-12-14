package com.xworkz.ButtonProcess.Controller;

import com.xworkz.ButtonProcess.Dto.DeathCerticateDto;
import com.xworkz.ButtonProcess.Service.DeathCertificateService;
import com.xworkz.ButtonProcess.Service.DeathServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Controller
public class DeathCertificateController {
    public DeathCertificateController(){
        System.out.println("const of death certificate");
    }
    @Autowired
    private DeathCertificateService deathCertificateService;


    @RequestMapping("/press")
    public String pressing(DeathCerticateDto deathCerticateDto){
        System.out.println(deathCerticateDto);
        boolean what=this.deathCertificateService.validAndSave(deathCerticateDto);
        if(what){
            System.out.println("data saved");
        }
        else{
            System.out.println("not saved");
        }
        return "DeathCertificate.jsp";
    }

}
