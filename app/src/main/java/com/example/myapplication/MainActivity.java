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

    private ViewPager2 viewPager2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        viewPager2 = findViewById(R.id.animalsSlider);
        List<SliderAnimals> sliderAnimals = new ArrayList<>();

        sliderAnimals.add(new SliderAnimals(R.drawable.alphabet));
        sliderAnimals.add(new SliderAnimals(R.drawable.bg));
        sliderAnimals.add(new SliderAnimals(R.drawable.un23));
        sliderAnimals.add(new SliderAnimals(R.drawable.fruits));

        viewPager2.setAdapter(new SliderAdapter(sliderAnimals,viewPager2));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttons
        abs = findViewById(R.id.abc);
        un23 = findViewById(R.id.un23);


        //Listener abs
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2Intent = new Intent(getApplicationContext(), abcActivity.class);
                startActivity(activity2Intent);

            }
        });

        //Listener un123

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2Intent = new Intent(getApplicationContext(), un23Activity.class);
                startActivity(activity2Intent);

            }
        });
    }
}
