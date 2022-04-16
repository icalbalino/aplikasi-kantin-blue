package com.example.canteenblueapp;

import static com.example.canteenblueapp.ItemList.getListData;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {

    private ArrayList<ItemCart> itemCarts = new ArrayList<>();
    public static final String ITEM_EXTRA = "item_extra";
    TextView tvName;
    TextView tvPrice;
    ImageView img;
    Button btnAddCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvName = findViewById(R.id.txt_name);
        tvPrice = findViewById(R.id.txt_price);
        img = findViewById(R.id.dtl_img);
        item item = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (item !=null){
            Glide.with(this)
                    .load(item.getPic())
                    .into(img);
            tvName.setText(item.getName());
            tvPrice.setText(String.valueOf(item.getPrice()));

        }

        btnAddCart = findViewById(R.id.btn_add_cart);

        btnAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name;
                float price;
                item item = getIntent().getParcelableExtra(ITEM_EXTRA);

                name = String.valueOf(item.getName());
                price = item.getPrice();

                Intent moveIntent1 = new Intent(Detail.this, CartFragment.class);
                moveIntent1.putExtra(CartFragment.ITEM_EXTRA, item);
                startActivity(moveIntent1);
            }
        });
    }
}