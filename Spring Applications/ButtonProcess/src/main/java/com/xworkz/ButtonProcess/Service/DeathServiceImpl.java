package com.xworkz.ButtonProcess.Service;

import com.xworkz.ButtonProcess.Dto.DeathCerticateDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class DeathServiceImpl implements DeathCertificateService{
    @Override
    public boolean validAndSave(DeathCerticateDto dto) {
        System.out.println("running valid and save");
        return true;
    }
}
