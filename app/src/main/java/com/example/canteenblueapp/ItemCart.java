package com.example.canteenblueapp;

import java.util.ArrayList;

public class ItemCart {
    private String name;
    private float price;
//    private int pic;

    public ItemCart(){
    }

    public ItemCart(String name, float price) {
        this.name = name;
        this.price = price;
//        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

//    public int getPic() {
//        return pic;
//    }
//
//    public void setPic(int pic) {
//        this.pic = pic;
//    }
}