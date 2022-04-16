package com.example.canteenblueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

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

//        btnAddCart.setOnClickListener( view -> { addToCart(); });
    }

//    private void addToCart (){
//
//    }
}