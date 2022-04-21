package com.example.canteenblueapp;

import android.app.Application;

public class MyApplication extends Application {
    private String nm;
    private float pr;

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public float getPr() {
        return pr;
    }

    public void setPr(float pr) {
        this.pr = pr;
    }
}
