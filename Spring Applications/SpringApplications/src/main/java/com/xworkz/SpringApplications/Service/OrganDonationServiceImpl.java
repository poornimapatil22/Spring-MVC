package com.xworkz.SpringApplications.Service;

import com.xworkz.SpringApplications.Dto.OrganDonationDto;
import org.springframework.stereotype.Service;

@Service
public class OrganDonationServiceImpl implements OrganDonationService{
    @Override
    public boolean validate(OrganDonationDto organDto) {
        return false;
    }
}
