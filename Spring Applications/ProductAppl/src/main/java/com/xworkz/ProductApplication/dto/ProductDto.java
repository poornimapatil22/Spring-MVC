package com.xworkz.ProductApplication.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
    private String name;
    private String type;
    private Double cost;
    private String manufacturer;
    private String date;
    private String warranty;

}
