package com.margieblair.model;

public class CatalogItem {

    private String name;
    private String desc;
    private int rating;

    public int getRating() {
        return rating;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
