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
    ImageView animals;




    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttons
        abs = findViewById(R.id.abc);
        un23 = findViewById(R.id.nbrs);
        animals = findViewById(R.id.anmls);


        //Listener abs
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abcIntent = new Intent(getApplicationContext(), abcActivity.class);
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
                Intent animalsIntent = new Intent(getApplicationContext(), animal_activity.class);
                startActivity(animalsIntent);


            }
        });
    }
}
