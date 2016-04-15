package com.example.livruen.amexer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseCampus extends AppCompatActivity {

    private Button campusMain;
    private Button campusAmExer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__campus);

        campusMain = (Button) findViewById(R.id.campus_main);
        campusAmExer = (Button) findViewById(R.id.campus_exer);

        setAction();
    }

    private void setAction(){

    campusAmExer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            startActivity(new Intent(ChooseCampus.this, FoodAmExer.class));

        }
    });

        campusMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ChooseCampus.this, FoodAmMain.class));

            }
        });
    }


}
