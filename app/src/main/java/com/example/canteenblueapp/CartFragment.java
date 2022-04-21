package com.example.canteenblueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class CartFragment extends Fragment {

    private ArrayList<ItemCart> itemgetset = new ArrayList<>();
    public static final String ITEM_EXTRA = "item_extra";
    private RecyclerView recyclerView;
    private ArrayList<item> item = new ArrayList<>();
    TextView tvName, tvAmount, tvPrice, tvTotalPrice;
    CardView cView;
    MaterialCardView mcView;
    ImageView imgView;
    private int amount;
    private float totalAmount;
    RecyclerView rv;
    boolean img = true;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        rv = view.findViewById(R.id.rv_item_cart);
        tvAmount = view.findViewById(R.id.item_cart_amount);
        cView = view.findViewById(R.id.cardView_cart_total_price);
        mcView = view.findViewById(R.id.card_cart_total_price);
        imgView = view.findViewById(R.id.ic_no_food);
        tvTotalPrice = view.findViewById(R.id.item_cart_totalAmount);

        rv.setHasFixedSize(true);
        itemgetset.addAll(getData());

        if (itemgetset != null) {
            show();
        } else {
        }
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_cart, container, false);
//
//        recyclerView = view.findViewById(R.id.rv_item_cart);
//        item.addAll(ItemList.getListData());
//        showRecyclerView();
//        return view;
//    }

    private void show(){
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterCart AdapterCart = new AdapterCart(itemgetset);
        rv.setAdapter(AdapterCart);
    }

    public ArrayList<ItemCart> getData() {
        String s = ((MyApplication) getActivity().getApplication()).getNm();
        float k = ((MyApplication) getActivity().getApplication()).getPr();

        String [] dataName = new String[]{s};
        float [] dataPrice = new float[]{k};
        ArrayList<ItemCart> list = new ArrayList<>();
        for (int i = 0 ; i <dataName.length;i++){
            ItemCart ItemCart = new ItemCart();
            ItemCart.setName(dataName[i]);
            ItemCart.setPrice(dataPrice[i]);
            list.add(ItemCart);
        }

        return list;
    }

//    private void showRecyclerView() {
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        RecyclerViewAdapterCart recyclerViewAdapterCart = new RecyclerViewAdapterCart(item);
//        recyclerView.setAdapter(recyclerViewAdapterCart);
//    }

}
