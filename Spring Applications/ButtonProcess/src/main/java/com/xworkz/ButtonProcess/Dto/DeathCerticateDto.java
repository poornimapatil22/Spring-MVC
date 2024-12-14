package com.xworkz.ButtonProcess.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
public class DeathCerticateDto {
    private Integer age;
    private String adress;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private String dob;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private String lastDate;
    private String causeOfDeath;
    private String name;


}
