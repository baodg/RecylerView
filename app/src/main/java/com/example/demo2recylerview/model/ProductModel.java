package com.example.demo2recylerview.model;

public class ProductModel {
    private int avatar;
    private int price;
    private String name;
    private String desc;

    public ProductModel(int avatar, int price, String name) {
        this.avatar = avatar;
        this.price = price;
        this.name = name;
    }

    public ProductModel() {
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
