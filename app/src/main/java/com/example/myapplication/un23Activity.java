package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class un23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un23);

        ImageView clickOne = (ImageView) findViewById(R.id.oneone);
        ImageView clickTwo = (ImageView) findViewById(R.id.twotwo);
        ImageView clickThree = (ImageView) findViewById(R.id.threethree);
        ImageView clickFour = (ImageView) findViewById(R.id.fourfour);


        final MediaPlayer one = MediaPlayer.create(getApplicationContext(),R.raw.one);
        final MediaPlayer two = MediaPlayer.create(getApplicationContext(),R.raw.two);
        final MediaPlayer three = MediaPlayer.create(getApplicationContext(),R.raw.three);
        final MediaPlayer four = MediaPlayer.create(getApplicationContext(),R.raw.four);

        View.OnClickListener elem = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.oneone:
                        one.start();
                        break;
                    case R.id.twotwo:
                        two.start();
                        break;
                    case R.id.threethree:
                        three.start();
                        break;
                    case R.id.fourfour:
                        four.start();
                        break;

                }
            }
        };
        clickOne.setOnClickListener(elem);
        clickTwo.setOnClickListener(elem);
        clickThree.setOnClickListener(elem);
        clickFour.setOnClickListener(elem);

    }
}
