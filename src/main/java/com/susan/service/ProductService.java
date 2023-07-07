package com.susan.service;

import com.susan.domain.dao.ProductMapper;

import com.susan.domain.entity.SearchByKeyword;
import com.susan.domain.request.ShowDetailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.susan.domain.entity.Product;
import com.susan.domain.request.ProductInsertRequest;
import com.susan.domain.request.ProductUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements ProductServiceImpl {

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

    public List<Product> findAllProduct(){
        List<Product> product = productMapper.findProduct();

        return product;
    }
}
