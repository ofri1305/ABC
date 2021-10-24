package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Play extends AppCompatActivity {
   // RelativeLayout layout =(RelativeLayout)findViewById(R.id.background);
      //  layout.setBackgroundResource(R.drawable.colorful1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getSupportActionBar().hide();

        TextView title= findViewById(R.id.titlePlay);
        Button spelling= findViewById(R.id.spelling);
        Button match= findViewById(R.id.match);
        Button listening= findViewById(R.id.listening);

        if(Global.getCategory()==0){
            title.setText("Letters");

            spelling.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivitySpelling();
                }
            });
            match.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityMatch();
                }
            });
            listening.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityListening();
                }
            });

        }
        if(Global.getCategory()==1){
            title.setText("Numbers");
            spelling.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivitySpelling();
                }
            });
            match.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityMatch();
                }
            });
            listening.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityListening();
                }
            });
        }
        if(Global.getCategory()==2){
            title.setText("Colors");
            spelling.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivitySpelling();
                }
            });
            match.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityMatch();
                }
            });
            listening.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityListening();
                }
            });
        }
        if(Global.getCategory()==3){
            title.setText("Animals");
            spelling.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivitySpelling();
                }
            });
            match.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityMatch();
                }
            });
            listening.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openActivityListening();
                }
            });
        }
    }
    public void  openActivitySpelling(){
        Intent intent= new Intent(this, Spelling.class);
        startActivity(intent);
    }
    public void  openActivityMatch(){
        Intent intent= new Intent(this, Match.class);
        startActivity(intent);
    }
    public void  openActivityListening(){
        Intent intent= new Intent(this, Listening.class);
        startActivity(intent);
    }

}