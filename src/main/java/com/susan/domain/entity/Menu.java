package com.susan.domain.entity;

public class Menu {
    private String store_name;
    private String name;
    private String category;
    private int price;
    private int count;

    public Menu(String store_name, String name, String category, int price, int count) {
        this.store_name = store_name;
        this.name = name;
        this.category = category;
        this.price = price;
        this.count = count;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
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
