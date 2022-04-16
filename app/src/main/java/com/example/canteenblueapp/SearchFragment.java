package com.example.canteenblueapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    private RecyclerView recyclerView;
    private Button btn_item;
    private ArrayList<item> item = new ArrayList<>();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    public SearchFragment(){ }

    public static SearchFragment newInstance(String param1,String param2){
        SearchFragment fragment = new SearchFragment();
        Bundle arg= new Bundle();
        arg.putString(ARG_PARAM1,param1);
        arg.putString(ARG_PARAM2,param2);
        fragment.setArguments(arg);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = view.findViewById(R.id.rv_item);
        recyclerView.setHasFixedSize(true);
        item.addAll(ItemList.getListData());
        showRecyclerView();
        btn_item = view.findViewById(R.id.item_btn);

        return view;
    }

    private void showRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(item);
        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerViewAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(item item) {
                Intent moveIntent1 = new Intent(getActivity(),Detail.class);
                moveIntent1.putExtra(Detail.ITEM_EXTRA, item);
                startActivity(moveIntent1);
            }
        });
    }


}