package com.example.canteenblueapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartFragment extends Fragment {
    private ArrayList<ItemCart> itemgetset = new ArrayList<>();
    RecyclerView rv;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_cart, container, false);
        rv = view.findViewById(R.id.rv_item_cart);
        rv.setHasFixedSize(true);

        itemgetset.addAll(getData());

        if (itemgetset != null){
            show();
        }else{

        }

        return view;
    }

    private void show(){
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterCart AdapterCart = new AdapterCart(itemgetset);
        rv.setAdapter(AdapterCart);
    }

    public ArrayList<ItemCart> getData(){


        String s = ((MyApplication) getActivity().getApplication()).getNm();
        float k = ((MyApplication) getActivity().getApplication()).getPr();


        String [] dataName = new String[]{s};
        float [] dataPrice = new float[]{k};
        ArrayList<ItemCart> list = new ArrayList<>();
        for (int i = 0 ; i <dataName.length;i++){
            ItemCart ItemCart = new ItemCart();
            ItemCart.setName(dataName[i]);
            ItemCart.setPrice(dataPrice[i]);

            list.add(ItemCart);}
        return list;

    }
}
