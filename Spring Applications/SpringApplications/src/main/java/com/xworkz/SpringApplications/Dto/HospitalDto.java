package com.xworkz.SpringApplications.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class HospitalDto {
    private String patientName;
    private String doctorName;
    private Double consultationFees;
    private String cause;
    private Boolean sick;

}
