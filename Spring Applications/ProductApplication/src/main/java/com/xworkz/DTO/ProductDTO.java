package com.xworkz.DTO;

import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class ProductDTO {
    private String companyName;
    private String productName;
    private  String productType;
    private int productQuantity;
    private double productCost;




}
