package com.susan.domain.entity;

public class Product {

    int pro_seq;
    String name;
    String category;

    public void createProduct(String product_name,String category){
        this.name=product_name;
        this.category=category;
    }

    public void createUpdateProduct(int product_seq,String product_name,String category){
        this.pro_seq = product_seq;
        this.name=product_name;
        this.category=category;
    }

    public int getProduct_seq() {
        return pro_seq;
    }

    public void setProduct_seq(int product_seq) {
        this.pro_seq = product_seq;
    }

    public String getProduct_name() {
        return name;
    }

    public void setProduct_name(String product_name) {
        this.name = product_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
