package com.susan.domain.request;

public class ProductUpdateRequest {
    private int seq;

    private String name;
    private String category;

    public ProductUpdateRequest(int seq, String name, String category) {
        this.seq = seq;
        this.name = name;
        this.category = category;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
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
}
