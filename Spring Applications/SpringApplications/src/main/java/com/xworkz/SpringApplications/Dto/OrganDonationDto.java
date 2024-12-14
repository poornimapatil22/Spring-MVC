package com.xworkz.SpringApplications.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrganDonationDto {
    private String email;
    private Long phone;
    private String dOB;
    private String bloodGroup;
    private String organ;
    private String address;
    private Long emergencyContact;
    private String  medicalHistory;
    private boolean consent;

}
