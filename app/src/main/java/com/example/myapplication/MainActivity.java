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

    ImageView vegts;
    ImageView un23;
    ImageView animals;




    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttons
        vegts = findViewById(R.id.vegts);
        un23 = findViewById(R.id.nbrs);
        animals = findViewById(R.id.anmls);


        //Listener abs
        vegts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abcIntent = new Intent(getApplicationContext(), Main_vegt.class);
                startActivity(abcIntent);

            }
        });


        un23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent un23Intent = new Intent(getApplicationContext(), un23Activity.class);
                startActivity(un23Intent);

            }
        });

        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(getApplicationContext(), animals.class);
                startActivity(animalsIntent);


            }
        });
    }
}
