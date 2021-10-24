package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LearnPlay extends AppCompatActivity {
    private Button learnLetters, learnNumbers, learnColors, learnAnimals, playLetters, playNumbers, playColors, playAnimals ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_play);
        getSupportActionBar().hide();

        TextView title= findViewById(R.id.title);

        if(Global.getCategory()==0){

            title.setText("Letters");
            learnLetters = (Button) findViewById(R.id.buttonLearn);
            playLetters = (Button) findViewById(R.id.buttonPlay);

            learnLetters.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityLearnLetNumAni();
                }
            });
            playLetters.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityPlay();
                }
            });

        }
        else if(Global.getCategory()==1){
            title.setText("Numbers");
            learnNumbers = (Button) findViewById(R.id.buttonLearn);
            playNumbers = (Button) findViewById(R.id.buttonPlay);

            learnNumbers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityLearnLetNumAni();
                }
            });

            playNumbers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityPlay();
                }
            });

        }
       else if(Global.getCategory()==2){
            title.setText("Colors");
            learnColors = (Button) findViewById(R.id.buttonLearn);
            playColors = (Button) findViewById(R.id.buttonPlay);

            learnColors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityLearnColors();
                }
            });
            playColors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityPlay();
                }
            });
        }
       else if(Global.getCategory()==3){
            title.setText("Animals");
            learnAnimals = (Button) findViewById(R.id.buttonLearn);
            playAnimals = (Button) findViewById(R.id.buttonPlay);

            learnAnimals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityLearnLetNumAni();
                }
            });
            playAnimals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityPlay();
                }
            });
        }
    }
    //learn
    public void openActivityLearnLetNumAni(){
        Intent intent= new Intent(this, LearnLetNumAni.class);
        startActivity(intent);
    }

    public void openActivityLearnColors(){
        Intent intent= new Intent(this, LearnColors.class);
        startActivity(intent);
    }
    //play
    public void openActivityPlay(){
        Intent intent= new Intent(this, Play.class);
        startActivity(intent);
    }



}