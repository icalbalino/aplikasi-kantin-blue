package com.example.canteenblueapp;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemCart implements Parcelable {

    private String name;
    private float price;

    public ItemCart() { }

    public ItemCart(String name, float price) {
        this.name = name;
        this.price = price;
    }

    protected ItemCart(Parcel in) {
        name = in.readString();
        price = in.readFloat();
    }

    public static final Creator<ItemCart> CREATOR = new Creator<ItemCart>() {
        @Override
        public ItemCart createFromParcel(Parcel in) { return new ItemCart(in); }

        @Override
        public ItemCart[] newArray(int size) { return new ItemCart[size]; }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() { return price; }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeFloat(price);
    }
}