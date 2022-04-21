package com.example.canteenblueapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterCart extends RecyclerView.Adapter<RecyclerViewAdapterCart.ListViewHolder> {

    private final ArrayList<item> listItem;

    public RecyclerViewAdapterCart(ArrayList<item> listItem) {
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final item item = listItem.get(position);
        holder.item_cart_name.setText(item.getName());
        holder.item_cart_price.setText(String.valueOf(item.getPrice()));
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView item_cart_name, item_cart_price;
        ListViewHolder(View itemView) {
            super(itemView);
            item_cart_name = itemView.findViewById(R.id.item_cart_name);
            item_cart_price = itemView.findViewById(R.id.item_cart_price);
        }
    }

}
