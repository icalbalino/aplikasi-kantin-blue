package com.example.canteenblueapp;

<<<<<<< HEAD
import java.util.ArrayList;

public class ItemCart {
    private String name;
    private float price;
//    private int pic;

    public ItemCart(){
=======
import android.os.Parcel;
import android.os.Parcelable;

public class ItemCart implements Parcelable {

    private String name;
    private float price;

    public ItemCart() {
>>>>>>> f4ff316c731a03a30de05a3d87e3434a5ff6affa
    }

    public ItemCart(String name, float price) {
        this.name = name;
        this.price = price;
<<<<<<< HEAD
//        this.pic = pic;
=======
>>>>>>> f4ff316c731a03a30de05a3d87e3434a5ff6affa
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

<<<<<<< HEAD
//    public int getPic() {
//        return pic;
//    }
//
//    public void setPic(int pic) {
//        this.pic = pic;
//    }
}
=======
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
>>>>>>> f4ff316c731a03a30de05a3d87e3434a5ff6affa
