package com.xworkz.SpringApplications.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
public class PassportDto {
    private String registerToApplyAt;
    private String givenName;
    private String surName;
    private String emailAdress;
    private boolean loginIdSameAsEmailId;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;
    private String dateOfBirth;

}
