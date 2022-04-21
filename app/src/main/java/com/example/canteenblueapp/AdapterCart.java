package com.example.canteenblueapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterCart extends RecyclerView.Adapter<AdapterCart.ListViewHolder>{

    private final ArrayList<ItemCart> listItemCart;

    public AdapterCart(ArrayList<ItemCart> listItemCart) {
        this.listItemCart = listItemCart;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final ItemCart ItemCart = listItemCart.get(position);
        holder.n.setText(ItemCart.getName());
        holder.k.setText(String.valueOf(ItemCart.getPrice()));
    }

    @Override
    public int getItemCount() {
        return listItemCart.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView n,k ;

        public ListViewHolder(View itemView) {
            super(itemView);
            n = itemView.findViewById(R.id.item_cart_name);
            k = itemView.findViewById(R.id.item_cart_price);
        }
    }
}
