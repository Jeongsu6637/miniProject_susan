package com.susan.domain.dto;

public class singupDto {
    //id, pw, name, address, phone, type
    // 실제 db값

    //생성자, 기본생성자, getter, setter

    private String id;
    private String password;
    private String name;
    private String address;
    private String phone;
    private int idType;

    public singupDto(String id, String password, String name, String address, String phone, int idType) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.idType = idType;
    }

    public singupDto() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }
}