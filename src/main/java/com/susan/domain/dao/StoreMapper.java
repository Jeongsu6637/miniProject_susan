package com.susan.domain.dao;

import com.susan.domain.entity.Cart;
import com.susan.domain.entity.Menu;
import com.susan.domain.entity.MyCart;
import com.susan.domain.entity.Store;
import com.susan.domain.request.CartRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreMapper {
    List<Store> findAllStore();
    List<Menu> findAllMenu(int store_seq);

    int addCart(CartRequest request);

    List<MyCart> AllCart(int userSeq);
}
