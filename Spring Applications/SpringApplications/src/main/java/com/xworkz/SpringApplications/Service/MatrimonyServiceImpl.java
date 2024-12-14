package com.xworkz.SpringApplications.Service;

import com.xworkz.SpringApplications.Dto.MatrimonyDto;
import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceImpl implements MatrimonyService{
    @Override
    public boolean valid(MatrimonyDto dto) {
        return false;
    }
}
