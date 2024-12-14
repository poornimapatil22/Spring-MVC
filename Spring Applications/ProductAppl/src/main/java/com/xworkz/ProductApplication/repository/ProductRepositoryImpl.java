package com.xworkz.ProductApplication.repository;

import com.xworkz.ProductApplication.dto.ProductDto;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements  ProductRepository{
    @Override
    public boolean save(ProductDto dto) {
        System.out.println("running save in ProductRepository");
        System.err.println("Should connect to DB");
        return true;
    }
}
