package com.example.canteenblueapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ListViewHolder>{

    private final ArrayList<item> listItem;
    private Button btn_item;


    public RecyclerViewAdapter(ArrayList<item>list){
        this.listItem = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final item item = listItem.get(position);

        Glide.with(holder.itemView.getContext())
                .load(item.getPic())
                .apply(new RequestOptions())
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

//            btn_item.findViewById(R.id.item_btn).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent moveIntent1 = new Intent(SearchFragment.this, CuisineDetailFragment.class);
//                    moveIntent1.putExtra(foodDetail.ITEM_EXTRA, food);
//                    startActivity(moveIntent1);
//                }
//            });
        }
    }
}


