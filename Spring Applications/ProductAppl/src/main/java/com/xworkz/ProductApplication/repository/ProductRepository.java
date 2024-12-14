package com.xworkz.ProductApplication.repository;

import com.xworkz.ProductApplication.dto.ProductDto;

public interface ProductRepository {

    boolean save(ProductDto dto);
}
