package com.xworkz.ProductApplication.service;

import com.xworkz.ProductApplication.dto.ProductDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService2 implements ProductService{
    @Override
    public boolean validSave(ProductDto productDto) {
        return false;
    }
}
