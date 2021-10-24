package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnColors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_learn_colors);
        Button black= findViewById(R.id.buttonBlack);
        Button blue= findViewById(R.id.buttonBlue);
        Button white= findViewById(R.id.buttonWhite);
        Button pink= findViewById(R.id.buttonPink);
        Button yellow= findViewById(R.id.buttonYellow);
        Button grey= findViewById(R.id.buttonGrey);
        Button green= findViewById(R.id.buttonGreen);
        Button red= findViewById(R.id.buttonRed);
        Button orange= findViewById(R.id.buttonOrange);
        Button brown= findViewById(R.id.buttonBrown);

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(0);
                openActivitySingleLetterForColors();

            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(1);
                openActivitySingleLetterForColors();

            }
        });
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(2);
                openActivitySingleLetterForColors();

            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(3);
                openActivitySingleLetterForColors();

            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(4);
                openActivitySingleLetterForColors();

            }
        });
        grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(5);
                openActivitySingleLetterForColors();

            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(6);
                openActivitySingleLetterForColors();

            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(7);
                openActivitySingleLetterForColors();

            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(8);
                openActivitySingleLetterForColors();

            }
        });
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setColor(9);
                openActivitySingleLetterForColors();

            }
        });
    }

    public void openActivitySingleLetterForColors(){

        Intent myIntent= new Intent(this, SingleNumCol.class);
        startActivity(myIntent);
    }
}