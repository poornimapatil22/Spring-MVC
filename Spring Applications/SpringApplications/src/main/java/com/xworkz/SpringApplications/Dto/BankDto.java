package com.xworkz.SpringApplications.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
public class BankDto{
    private String custName;
    private long custAcNo;
    private String applicationDate;
}
