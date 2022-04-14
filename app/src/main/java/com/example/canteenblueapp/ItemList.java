package com.example.canteenblueapp;

import java.util.ArrayList;

public class ItemList {
    private static String[] nameItem = {
            "Dim sam",
            "Dim 1",
            "dim"
    };

    private static float[] price = {
            2,
            3,
            5
    };
    private  static  int[] pic={
            R.mipmap.dimsum_eggplant,
            R.mipmap.dimsum_shrimp,
            R.mipmap.dimsum_soup
    };


    static ArrayList<item> getListData() {
        ArrayList<item> list = new ArrayList<>();
        for (int position = 0; position < nameItem.length; position++) {
            item item = new item();
            item.setName(nameItem[position]);
            item.setPrice(price[position]);
            item.setPic(pic[position]);
            list.add(item);
        }
        return list;
    }
}
