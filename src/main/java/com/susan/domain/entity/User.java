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

<<<<<<< HEAD
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

=======
>>>>>>> giseok
    public String getId() {
        return id;
    }

<<<<<<< HEAD
=======
    public void setId(String id) {
        this.id = id;
    }

>>>>>>> giseok
    public String getPassword() {
        return password;
    }

<<<<<<< HEAD
=======
    public void setPassword(String password) {
        this.password = password;
    }

>>>>>>> giseok
    public String getAddress() {
        return address;
    }

<<<<<<< HEAD
=======
    public void setAddress(String address) {
        this.address = address;
    }

>>>>>>> giseok
    public String getName() {
        return name;
    }

<<<<<<< HEAD
=======
    public void setName(String name) {
        this.name = name;
    }

>>>>>>> giseok
    public String getPhone() {
        return phone;
    }

<<<<<<< HEAD
    public int getIdType() {
        return idType;
    }
=======
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }
>>>>>>> giseok
}
