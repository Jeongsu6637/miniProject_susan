package com.susan.domain.dao;

import com.susan.domain.entity.MongoOrderInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<MongoOrderInfo,String> {


}
