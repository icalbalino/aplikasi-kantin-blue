package com.example.canteenblueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartFragment extends Fragment {
<<<<<<< HEAD
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
=======

    public static final String ITEM_EXTRA = "item_extra";
    private RecyclerView recyclerView;
    private ArrayList<item> item = new ArrayList<>();
    TextView tvName, tvAmount, tvPrice, tvTotalPrice;
    private int amount;
    private float totalAmount;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        recyclerView = view.findViewById(R.id.rv_item_cart);
        item.addAll(ItemList.getListData());
        showRecyclerView();
>>>>>>> f4ff316c731a03a30de05a3d87e3434a5ff6affa

        return view;
    }

<<<<<<< HEAD
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

=======
    private void showRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerViewAdapterCart recyclerViewAdapterCart = new RecyclerViewAdapterCart(item);
        recyclerView.setAdapter(recyclerViewAdapterCart);
>>>>>>> f4ff316c731a03a30de05a3d87e3434a5ff6affa
    }


}
