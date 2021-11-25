package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView abs;
    ImageView un23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
