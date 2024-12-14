package com.xworkz.Impl;

import com.xworkz.DTO.ProductDTO;
import com.xworkz.Interface.Product;

public class ProductImpl implements Product {
   public boolean serve(ProductDTO productDTO){

       boolean isValid=true;

       if(productDTO.getCompanyName().length()<3 || productDTO.getCompanyName()==null||productDTO.getCompanyName().length()>30){
           System.err.println("enter more than 3 characters also less than 30 for name and name can not be null ");
           isValid= false;
       }

       if(productDTO.getProductName().length()<3 || productDTO.getProductName()==null || productDTO.getProductName().length()>30){
           System.err.println("enter more than 3 characters also less than 30 for name and can not be null ");
           isValid= false;
       }
       if(productDTO.getProductQuantity()<1|| productDTO.getProductQuantity()>10){
           System.err.println("confirm password is incorrect ");
           isValid= false;
       }
       if(productDTO.getProductCost()>1000000){
           System.err.println("password is not matching");
           isValid=false;
       }


       return isValid;
   }


}
