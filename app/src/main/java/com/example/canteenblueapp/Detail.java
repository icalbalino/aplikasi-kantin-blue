package com.example.canteenblueapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Detail extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ItemCart> ItemCart = new ArrayList<>();
    private ArrayList<ItemCart> itemCarts = new ArrayList<>();
    public static final String ITEM_EXTRA = "item_extra";
    TextView tvName, tvPrice, tvnn ,tvn;
    ImageView img;
    Button btn, btnAddCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvName = findViewById(R.id.txt_name);
        tvPrice = findViewById(R.id.txt_price);
        img = findViewById(R.id.dtl_img);
        btn = findViewById(R.id.btn_add_cart);

        item item = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (item !=null) {
            Glide.with(this)
                    .load(item.getPic())
                    .into(img);
            tvName.setText(item.getName());
            tvPrice.setText(String.valueOf(item.getPrice()));
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nm = tvName.getText().toString();
                float pr = Float.valueOf(tvPrice.getText().toString());
                ((MyApplication) getApplication()).setNm(nm);
                ((MyApplication) getApplication()).setPr(pr);
                Toast.makeText(Detail.this, "ADD TO CART", Toast.LENGTH_SHORT).show();
            }
        });

//        btnAddCart = findViewById(R.id.btn_add_cart);
//        btnAddCart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name;
//                float price;
//                item item = getIntent().getParcelableExtra(ITEM_EXTRA);
//
//                name = String.valueOf(item.getName());
//                price = item.getPrice();
//
//                Intent moveIntent1 = new Intent(Detail.this, CartFragment.class);
//                moveIntent1.putExtra(CartFragment.ITEM_EXTRA, item);
//                startActivity(moveIntent1);
//            }
//        });
    }
}

