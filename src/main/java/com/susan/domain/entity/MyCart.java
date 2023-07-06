package com.susan.domain.entity;

public class MyCart {
    private int user_seq;
    private int store_seq;
    private int pro_seq;
    private String name;
    private String category;
    private String location;
    private String store_name;
    private String store_number;
//    private String image_link;
    private int price;
    private int count;

    public MyCart(int user_seq, int store_seq, int pro_seq, String name, String category, String location, String store_number, int price, int count, String store_name) {
        this.user_seq = user_seq;
        this.store_seq = store_seq;
        this.pro_seq = pro_seq;
        this.name = name;
        this.category = category;
        this.location = location;
        this.store_number = store_number;
        this.price = price;
        this.count = count;
        this.store_name = store_name;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

    public int getStore_seq() {
        return store_seq;
    }

    public void setStore_seq(int store_seq) {
        this.store_seq = store_seq;
    }

    public int getPro_seq() {
        return pro_seq;
    }

    public void setPro_seq(int pro_seq) {
        this.pro_seq = pro_seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
