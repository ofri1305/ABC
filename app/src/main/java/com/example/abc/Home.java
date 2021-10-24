package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
private Button buttonLetters, buttonNumbers, buttonColors, buttonAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();


        buttonLetters= (Button) findViewById(R.id.buttonLetters);
        buttonLetters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setCategory(0);
                openActivityLearnPlay();
            }
        });

        buttonNumbers= (Button) findViewById(R.id.buttonNumbers);
        buttonNumbers.setOnClickListener(new View.OnClickListener() {

         
            public void onClick(View v) {
                Global.setCategory(1);
                openActivityLearnPlay();
            }
        });

        buttonColors= (Button) findViewById(R.id.buttonColors);
        buttonColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setCategory(2);
                openActivityLearnPlay();
            }
        });

        buttonAnimals= (Button) findViewById(R.id.buttonAnimals);
        buttonAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.setCategory(3);
                openActivityLearnPlay();
            }
        });

    }
    public void openActivityLearnPlay(){

        Intent intent1= new Intent(this, LearnPlay.class);
        startActivity(intent1);
    }
}
