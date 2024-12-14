package com.xworkz.SpringApplications.Controller;

import com.xworkz.SpringApplications.Dto.*;
import com.xworkz.SpringApplications.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AllApplicationsController {
public AllApplicationsController(){
    System.out.println("constructor of all allapplicationController ");
}

@Autowired
private BankService bankService;
@PostMapping("/apply")
public String bankController(BankDto bankDto){
    System.out.println("method of bankController");

   boolean see= this.bankService.validAndSave(bankDto);
    System.out.println(bankDto);
    if(see){
        System.out.println("data  saved");
    }else{
        System.out.println("data not saved");
    }
    return "Bank.jsp";
}

@Autowired
private PassportService passportService;
@RequestMapping("/save")
public String passportController(PassportDto p2){
    System.out.println("controller method of passport");
    System.out.println(p2);
    boolean watch=this.passportService.valid(p2);
    if(watch){
        System.out.println("passport application submitted");
    }else {
        System.out.println("failed to submit passport application");
    }
    return "Passport.jsp";
}



    @Autowired
    private HospitalService hospitalService;
    @RequestMapping("/consult")
    public String hospitalController(HospitalDto h2){
        System.out.println("controller method of passport");
        System.out.println(h2);
        boolean watch=this.hospitalService.valid(h2);
        if(watch){
            System.out.println("hospital application submitted");
        }else {
            System.out.println("failed to submit hospital application");
        }
        return "Hospital.jsp";
    }



    @Autowired
    private JobService jobService;
    @RequestMapping("/Add")
    public String JobController(JobDto j2){
        System.out.println("controller method of passport");
        System.out.println(j2);
        boolean watch=this.jobService.valid(j2);
        if(watch){
            System.out.println("job application submitted");
        }else {
            System.out.println("failed to submit job application");
        }
        return "Job.jsp";
    }


    @Autowired
    private OrganDonationService organDonationService;
    @RequestMapping("/donate")
    public String organController(OrganDonationDto d2){
        System.out.println("controller method of passport");
        System.out.println(d2);
        boolean watch=this.organDonationService.validate(d2);
        if(watch){
            System.out.println("Organ Donation application submitted");
        }else {
            System.out.println("failed to submit organ donation application");
        }
        return "OrganDonation.jsp";
    }



    @Autowired
    private MatrimonyService matrimonyService;
    @RequestMapping("/Register")
    public String MatrimonyController(MatrimonyDto m2){
        System.out.println("controller method of passport");
        System.out.println(m2);
        boolean watch=this.matrimonyService.valid(m2);
        if(watch){
            System.out.println("Organ Donation application submitted");
        }else {
            System.out.println("failed to submit organ donation application");
        }
        return "matrimony.jsp";
    }
}
