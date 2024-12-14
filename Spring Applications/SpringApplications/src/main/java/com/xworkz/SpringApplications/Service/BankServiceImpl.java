package com.xworkz.SpringApplications.Service;

import com.xworkz.SpringApplications.Dto.BankDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{
    @Override
    public boolean validAndSave(BankDto b2) {
        return false;
    }
}
