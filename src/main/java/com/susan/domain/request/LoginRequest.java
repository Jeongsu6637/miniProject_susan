package com.susan.domain.request;

public class LoginRequest {
    private String id;
    private String password;
    private int idType;

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

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public LoginRequest(String id, String password, int idType) {
        this.id = id;
        this.password = password;
        this.idType = idType;
    }
}
