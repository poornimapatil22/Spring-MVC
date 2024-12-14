package com.xworkz.ProductApplication.service;

import com.xworkz.ProductApplication.dto.ProductDto;
import com.xworkz.ProductApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean validSave(ProductDto productDto) {

        System.out.println("running validaSave in ProductServiceImpl");

       Boolean saved=  this.productRepository.save(productDto);
        System.out.println("saved from DB : "+saved);
        return saved;
    }
}
