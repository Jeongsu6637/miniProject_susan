package com.susan.domain.request;

public class SignupRequest {

    // 회원가입 시 받아올 정보
    // jsp 변수와 같아야 한다.
    private String id;
    private String password;
    private String name;
    private String address;
    private String phone;

    private Integer idType;

//    private int mode; // 회원가입 모드(1: 관리자, 2: 일반 유저)


    public SignupRequest(String id, String password, String name, String address, String phone, Integer idType) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.idType = idType;
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

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }
}