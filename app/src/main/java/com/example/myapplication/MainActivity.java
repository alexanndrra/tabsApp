package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;

public class MainActivity extends AppCompatActivity {

    TabItem tabItemDog;
    TabItem tabItemCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabItemDog = findViewById(R.id.dogsTabItem);
        tabItemCat = findViewById(R.id.catsTabItem);

    }

    public void tabClicked(View v){
    }

}