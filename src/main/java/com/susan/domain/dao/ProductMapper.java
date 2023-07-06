package com.susan.domain.dao;

import com.susan.domain.entity.Order;
import com.susan.domain.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    // 물품 등록 SQL
    Integer insertProduct(Product product);

    //물품 수정 SQL
    Integer updateProduct(Product product);

    //물품 삭제 SQL
    Integer deleteProduct(int seq);

    //모든 물품을 보는 SQL
    List<Product> findProduct();
}
