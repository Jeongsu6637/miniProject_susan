package com.susan.service;


import com.susan.domain.dao.MongoRepository;
import com.susan.domain.entity.MongoOrderInfo;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoService {

    private final MongoRepository mongoRepository;
    private final MongoTemplate mongoTemplate;

    public MongoService(MongoRepository mongoRepository, MongoTemplate mongoTemplate) {
        this.mongoRepository = mongoRepository;
        this.mongoTemplate = mongoTemplate;
    }

    public void insertData() {
        MongoOrderInfo mongoOrderInfo = new MongoOrderInfo();
        mongoOrderInfo.setName("태홍");
        mongoOrderInfo.setStore("A상점");
        mongoOrderInfo.setState("구매요청");

        mongoTemplate.insert(mongoOrderInfo);

    }

    public void findData(){
        List<MongoOrderInfo> mongoOrderInfos = mongoTemplate.find(Query.query(Criteria.where("name").is("태홍")),
                MongoOrderInfo.class);

        for(MongoOrderInfo m :mongoOrderInfos){
            System.out.println(m.getName());
            System.out.println(m.getStore());
            System.out.println(m.getState());
        }
    }
}
