package com.xworkz.SpringApplications.Service;

import com.xworkz.SpringApplications.Dto.HospitalDto;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Override
    public boolean valid(HospitalDto hospitalDto) {
        return false;
    }
}
