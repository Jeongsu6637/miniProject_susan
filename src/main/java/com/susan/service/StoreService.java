package com.susan.service;

import com.susan.dao.StoreMapper;
import com.susan.domain.entity.Menu;
import com.susan.domain.entity.MyCart;
import com.susan.domain.entity.Store;
import com.susan.domain.request.CartRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final StoreMapper storeMapper;
    public StoreService(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    public List<Store> findAllStore(){
        return storeMapper.findAllStore();
    }

    public List<Menu> findAllMenu(int store_seq){
        return storeMapper.findAllMenu(store_seq);
    }

    public int insertcart(CartRequest request){
        return storeMapper.addCart(request);
    }

    public List<MyCart> AllCart(int userSeq){
        return storeMapper.AllCart(userSeq);
    }
}
