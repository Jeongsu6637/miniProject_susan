package com.susan.service;

import com.susan.domain.dao.ProductMapper;
import com.susan.domain.entity.SearchByKeyword;
import com.susan.domain.request.ShowDetailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public List<SearchByKeyword> searchDefault(String keyword) {
        if(list == null && keyword == null){
            list = productMapper.searchDefault(keyword);

        }
        if(keyword != null) {
            keyword = "%" + keyword + "%";
            List<SearchByKeyword> Keyword = productMapper.searchDefault(keyword);
            return Keyword;
        }
        return list;

    }
    @Override
    public List<SearchByKeyword> searchDesc(String keyword) {
        if(keyword != null) {
            keyword = "%" + keyword + "%";
            List<SearchByKeyword> Keyword = productMapper.searchDesc(keyword);
            return Keyword;
        }
        return list;
    }
    @Override
    public List<SearchByKeyword> searchAsc(String keyword) {
        if(keyword != null) {
            keyword = "%" + keyword + "%";
            List<SearchByKeyword> Keyword = productMapper.searchAsc(keyword);
            return Keyword;
        }
        return list;
    }

    @Override
    public List<ShowDetailRequest> showDetail(String name) {
        List<ShowDetailRequest> storename = productMapper.showDetail(name);
        return storename;
    }


}
