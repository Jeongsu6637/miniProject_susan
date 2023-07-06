package com.susan.domain.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class User {
    private String id;
    private String password;
    private String address;
    private String name;
    private String phone;
    private int idType;

    @JsonCreator
    public User(@JsonProperty("id") String id,@JsonProperty("password") String password,
                @JsonProperty("address") String address,
                @JsonProperty("name") String name,
                @JsonProperty("phone") String phone,
                @JsonProperty("idType") int idType) {

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

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getIdType() {
        return idType;
    }
}
