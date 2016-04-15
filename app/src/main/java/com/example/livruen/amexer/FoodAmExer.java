package com.example.livruen.amexer;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import java.util.Calendar;

public class FoodAmExer extends AppCompatActivity {

    /*Constants*/
    final int SOLFERINO_OPEN_HOUR = 8;
    final int SOLFERINO_CLOSE_HOUR = 16;

    final int LIMES_OPEN_HOUR = 7;
    final int LIMES_CLOSE_HOUR = 14;


    private EditText solferino_text;
    private EditText solferino_time;

    private EditText limes_text;
    private EditText limes_time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_am_exer);

        //Puts an Image to the Action Bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setIcon(R.mipmap.food_icon);
            actionBar.setDisplayShowTitleEnabled(false); // entfernt den text von der Action bar
            Log.i("FoodAmExer", " action bar");
        } else {
            Log.i("FoodAmExer", "no action bar");
        }

        // Initialize Objects in View

        limes_text = (EditText) findViewById(R.id.solferino_text);
        limes_text = (EditText) findViewById(R.id.solferino_time);

        limes_text = (EditText) findViewById(R.id.limes_text);
        limes_text = (EditText) findViewById(R.id.limes_time);

        //Get Time
        Calendar c = Calendar.getInstance();
        int currentHour = c.get(Calendar.HOUR);
        int currentMinute = c.get(Calendar.MINUTE);



        //solferino_text.setText("OPEN");
        if(currentHour >= SOLFERINO_OPEN_HOUR && currentHour <= SOLFERINO_CLOSE_HOUR){
            //  solferino_text.setText("OPEN", TextView.BufferType.EDITABLE);
            //solferino_text.setTextColor(Color.GREEN);
        }
        if(currentHour >= LIMES_OPEN_HOUR && currentHour <= LIMES_CLOSE_HOUR){
            //limes_text.setText("OPEN", TextView.BufferType.EDITABLE);
            // limes_text.setTextColor(Color.GREEN);
        }
    }
}
