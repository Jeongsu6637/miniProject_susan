package com.susan.domain.entity;

import org.springframework.context.annotation.Primary;

import java.security.PrivateKey;

public class Store {
    private int store_seq;
    private String store_name;
    private String location;
    private String store_number;
    private String image_link;

    public Store(int store_seq, String store_name, String location, String store_number, String image_link) {
        this.store_seq = store_seq;
        this.store_name = store_name;
        this.location = location;
        this.store_number = store_number;
        this.image_link = image_link;
    }

    public int getStore_seq() {
        return store_seq;
    }

    public void setStore_seq(int store_seq) {
        this.store_seq = store_seq;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStore_number() {
        return store_number;
    }

    public void setStore_number(String store_number) {
        this.store_number = store_number;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }
}
