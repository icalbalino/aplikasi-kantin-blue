package com.example.canteenblueapp;

import java.util.ArrayList;

public class ItemList {
    private static String[] nameItem = {
            "Shrimp Dumplings",
            "Soup Dumplings",
            "Stuffed Eggplant",
            "Build your own",
            "MeatLovers",
            "Veggie",
            "Taco",
            "Quesadilla",
            "Burrito"
    };

    private static float[] price = {
            (float) 6.49,
            (float) 9.99,
            (float) 5.59,
            (float) 17.99,
            (float) 18.49,
            (float) 17.49,
            (float) 3.45,
            (float) 6.49,
            (float) 5.59
    };

    private  static  int[] pic={
            R.mipmap.dimsum_eggplant,
            R.mipmap.dimsum_shrimp,
            R.mipmap.dimsum_soup,
            R.mipmap.pizza_plain,
            R.mipmap.pizza_meat,
            R.mipmap.pizza_veggie,
            R.mipmap.taco_taco,
            R.mipmap.taco_quesadilla,
            R.mipmap.taco_burrito
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
