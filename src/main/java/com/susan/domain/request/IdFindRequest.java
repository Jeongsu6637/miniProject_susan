package com.susan.domain.request;

public class IdFindRequest {
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public IdFindRequest(String phone) {
        this.phone = phone;
    }
}
