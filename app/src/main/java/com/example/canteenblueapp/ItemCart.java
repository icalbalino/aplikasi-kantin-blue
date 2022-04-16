package com.example.canteenblueapp;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemCart implements Parcelable {

    private String name;
    private float price;

    public ItemCart() {
    }

    public ItemCart(String name, float price) {
        this.name = name;
        this.price = price;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
