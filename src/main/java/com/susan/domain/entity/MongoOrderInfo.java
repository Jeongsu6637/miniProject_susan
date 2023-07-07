package com.susan.domain.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "mongoOrderInfo")
public class MongoOrderInfo {

    @Id
    private String seq;
    private String name;
    private String store;

//    private List<>

    private String state;

//    public MongoOrderInfo(String seq, String name, String store, String state) {
//        this.seq = seq;
//        this.name = name;
//        this.store = store;
//        this.state = state;
//    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
