package com.susan.service;

import com.susan.domain.dao.ProductMapper;
import com.susan.domain.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ProductMapper productMapper;

    public OrderService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public void insertProduct(){
        Product p = new Product();
        p.createProduct("고등어","수산물");
        productMapper.insertProduct(p);
    }
}
