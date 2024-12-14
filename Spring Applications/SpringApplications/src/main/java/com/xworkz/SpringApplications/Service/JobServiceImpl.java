package com.xworkz.SpringApplications.Service;

import com.xworkz.SpringApplications.Dto.JobDto;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{

    @Override
    public boolean valid(JobDto jobDto) {
        return false;
    }
}
