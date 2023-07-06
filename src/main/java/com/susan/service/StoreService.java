package com.susan.service;

import com.susan.domain.dao.StoreMapper;
import com.susan.domain.entity.Menu;
import com.susan.domain.entity.Store;
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



}
