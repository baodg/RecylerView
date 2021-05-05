package com.example.demo2recylerview.choicescreen;

public class DonutModel {
    private int avatar;
    private String name;
    private String desc;
    private int price;

    public DonutModel(int avatar, String name, String desc, int price) {
        this.avatar = avatar;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public DonutModel() {
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
