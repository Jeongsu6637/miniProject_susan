package com.susan.domain.request;

public class SearchRequest {
    private String name;
    private String image_link;

    public SearchRequest(String name, String image_link) {
        this.name = name;
        this.image_link = image_link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }
}
