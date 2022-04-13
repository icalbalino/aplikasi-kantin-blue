package com.example.canteenblueapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.security.AccessController;
import java.util.ArrayList;



public class RecycleviewAdapter extends RecyclerView.Adapter<RecycleviewAdapter.ListViewHolder>{

    private final ArrayList<item> listItem;


    public RecycleviewAdapter(ArrayList<item>list){
        this.listItem = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        final item item = listItem.get(position);
        Glide.with(ListViewHolder.itemView.getContext())
                .load(item.getPic())
                .apply(new RequestOptions().override(55,55))
                .into(holder.item_pic);

        holder.item_name.setText(item.getName());
        holder.item_price.setText(String.valueOf(item.getPrice()));

    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView item_pic;
        TextView item_name, item_price;

        ListViewHolder(View itemView) {
            super(itemView);
            item_pic = itemView.findViewById(R.id.item_img);
            item_name = itemView.findViewById(R.id.item_name);
            item_price = itemView.findViewById(R.id.item_price);
            ;
        }
    }
}


