package com.susan.domain.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class User {
    private int user_seq;
    private String id;
    private String password;
    private String address;
    private String name;

    private String phone;
    private int idType;

    @JsonCreator
    public User(@JsonProperty("user_seq") int user_seq,
                @JsonProperty("id") String id,
                @JsonProperty("password") String password,
                @JsonProperty("name") String name,
                @JsonProperty("address") String address,
                @JsonProperty("phone") String phone,
                @JsonProperty("idType") int idType) {

        this.user_seq = user_seq;
        this.id = id;
        this.password = password;
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.idType = idType;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_seq='" + user_seq + '\'' +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", idType=" + idType +
                '}';
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

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
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

    public int getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(int user_seq) {
        this.user_seq = user_seq;
    }

}
