package com.xworkz.SpringApplications.Service;

import com.xworkz.SpringApplications.Dto.PassportDto;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService{

    @Override
    public boolean valid(PassportDto p2) {
        System.out.println("passport impl method");
        return true;
    }
}
