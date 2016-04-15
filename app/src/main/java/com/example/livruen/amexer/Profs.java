package com.example.livruen.amexer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Profs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profs);

        //Puts an Image to the Action Bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setIcon(R.mipmap.ic_profs);
            actionBar.setDisplayShowTitleEnabled(false); // entfernt den text von der Action bar
            Log.i("FoodAmExer", " action bar");
        } else {
            Log.i("FoodAmExer", "no action bar");
        }
    }
}
