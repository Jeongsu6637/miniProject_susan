package com.susan.service;

import com.susan.domain.dao.ProductMapper;
import com.susan.domain.entity.SearchByKeyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class ProductService implements ProductServiceImpl{
    @Autowired
    private final ProductMapper productMapper;
    private List<SearchByKeyword> list;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
    @Override
    public List<SearchByKeyword> searchByKeyword(String keyword) {
        if(list == null && keyword == null){
            list = productMapper.searchByKeyword(keyword);
        }
        if(keyword != null) {
            keyword = "%" + keyword + "%";
            List<SearchByKeyword> Keyword = productMapper.searchByKeyword(keyword);
            return Keyword;
        }
        return list;

    }
}
