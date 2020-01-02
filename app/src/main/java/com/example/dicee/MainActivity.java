package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll=findViewById(R.id.image_);
     final   ImageView left = findViewById(R.id.image_left);
     final    ImageView right=findViewById(R.id.image_right);
       final int[] da={R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","pressed");
                Random num=new Random();
                int n=num.nextInt(6);
                Log.d("Dicee","generated"+n);
                left.setImageResource(da[n]);
                n=num.nextInt(6);
                right.setImageResource(da[n]);




            }
        });

    }
}
