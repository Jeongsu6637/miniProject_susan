package com.susan.service;

import com.susan.domain.dao.ProductMapper;
import com.susan.domain.entity.Product;
import com.susan.domain.request.ProductInsertRequest;
import com.susan.domain.request.ProductUpdateRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public void insertProduct(ProductInsertRequest p){
        Product product = new Product();
        product.createProduct(p.getName(),p.getCategory());
        productMapper.insertProduct(product);
    }

    public void updateProduct(ProductUpdateRequest p){
        Product product = new Product();
        product.createUpdateProduct(p.getSeq(),p.getName(),p.getCategory());
        productMapper.updateProduct(product);
    }

    public void deleteProduct(int seq){

        productMapper.deleteProduct(seq);
    }
}
