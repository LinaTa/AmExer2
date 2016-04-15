package com.example.livruen.amexer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class FoodAmMain extends AppCompatActivity {

    final int MENSA_OPEN_HOUR = 7;
    final int MENSA_CLOSE_HOUR = 14;

    private EditText mensa_text;
    private EditText mensa_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_am_main);

        //Puts an Image to the Action Bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setIcon(R.mipmap.food_icon);
            actionBar.setDisplayShowTitleEnabled(false); // entfernt den text von der Action bar
            Log.i("FoodAmMain", " action bar");
        } else {
            Log.i("FoodAmMain", "no action bar");
        }
    }
}
