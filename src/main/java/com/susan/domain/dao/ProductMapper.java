package com.susan.domain.dao;

import com.susan.domain.entity.Order;
import com.susan.domain.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    Integer insertProduct(Product product);
}
