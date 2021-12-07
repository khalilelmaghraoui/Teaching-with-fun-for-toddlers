package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class animals extends AppCompatActivity {
    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        viewPager2 = findViewById(R.id.viewpager);
        int[] images = {R.drawable.lion,R.drawable.cat,R.drawable.gazelle,R.drawable.dog,R.drawable.fish};
        String[] heading = {"lion","cat","gazelle","dog","fish"};
        String[] desc = {getString(R.string.lion_desc),
            getString(R.string.cat_desc),
            getString(R.string.gazelle_desc),
            getString(R.string.dog_desc)
            ,getString(R.string.fish_desc)};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i =0; i< images.length ; i++){

            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i],heading[i],desc[i]);
            viewPagerItemArrayList.add(viewPagerItem);

        }

        VPAdapter vpAdapter = new VPAdapter(viewPagerItemArrayList);

        viewPager2.setAdapter(vpAdapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);


    }
}
