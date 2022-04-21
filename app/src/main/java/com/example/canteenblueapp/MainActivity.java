package com.example.canteenblueapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavView;
    MaterialToolbar appNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavView = findViewById(R.id.bottom_navigation);
        appNav = findViewById(R.id.topAppBar);

        appNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, new HomeFragment())
                        .commit();
            }
        });

        bottomNavView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new HomeFragment())
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.page_home: {
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.content_frame, new HomeFragment())
                                    .commit();
                        }
                        break;
                        case R.id.page_search: {
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.content_frame, new SearchFragment())
                                    .commit();
                        }
                        break;
                        case R.id.page_cart: {
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.content_frame, new CartFragment())
                                    .commit();
                        }
                        break;
                    }
                    return true;
                }
            };
}