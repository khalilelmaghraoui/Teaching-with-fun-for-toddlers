package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView abs;
    ImageView un23;
    ImageView animls;


    private ViewPager2 viewPager2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttons
        abs = findViewById(R.id.abc);
        un23 = findViewById(R.id.nbrs);
        animls = findViewById(R.id.anmls);


        //Listener abs
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2Intent = new Intent(getApplicationContext(), abcActivity.class);
                startActivity(activity2Intent);

            }
        });


        un23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2Intent = new Intent(getApplicationContext(), un23Activity.class);
                startActivity(activity2Intent);

            }
        });
        animls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(getApplicationContext(), animals.class);
                startActivity(animalsIntent);

            }
        });


    }
}
