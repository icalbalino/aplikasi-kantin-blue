package com.example.canteenblueapp;

import android.os.Parcel;
import android.os.Parcelable;

public class item implements Parcelable {
    private String name;
    private float price;
    private int pic;

    public item(String name, float price, int pic) {
        this.name = name;
        this.price = price;
        this.pic = pic;
    }




    public item() {

    }


    protected item(Parcel in) {
        name = in.readString();
        price = in.readFloat();
        pic = in.readInt();
    }

    public static final Creator<item> CREATOR = new Creator<item>() {
        @Override
        public item createFromParcel(Parcel in) {
            return new item(in);
        }

        @Override
        public item[] newArray(int size) {
            return new item[size];
        }
    };

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
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
        parcel.writeString(name);
        parcel.writeFloat(price);
        parcel.writeInt(pic);
    }
}
