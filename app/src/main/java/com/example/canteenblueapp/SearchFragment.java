package com.example.canteenblueapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<item> item = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = view.findViewById(R.id.rv_item);
        recyclerView.setHasFixedSize(true);
        item.addAll(ItemList.getListData());
        showRecyclerView();

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