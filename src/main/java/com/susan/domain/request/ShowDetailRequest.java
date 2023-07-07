package com.susan.domain.request;

public class ShowDetailRequest {
    private String store_name;
    private String image_link;
    private String store_number;
    private String location;
    private String name;
    private int price;

    public ShowDetailRequest(String store_name, String image_link, String store_number, String location, String name, int price) {
        this.store_name = store_name;
        this.image_link = image_link;
        this.store_number = store_number;
        this.location = location;
        this.name = name;
        this.price = price;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getStore_number() {
        return store_number;
    }

    public void setStore_number(String store_number) {
        this.store_number = store_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShowDetailRequest{" +
                "store_name='" + store_name + '\'' +
                ", image_link='" + image_link + '\'' +
                ", store_number='" + store_number + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
