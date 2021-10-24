package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleNumCol extends AppCompatActivity {
    MediaPlayer audioNumCol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_num_col);
        getSupportActionBar().hide();

        int num = Global.getGlobalIntegerNumbersList();


        TextView englishNumCol = findViewById(R.id.englishNumCol);
        TextView hebrewNumCol = findViewById(R.id.hebrewNumCol);
        ImageView imageNumCol = findViewById(R.id.imageNumCol);

        if(Global.getCategory()==2){
            if (Global.getColor()==0){
                englishNumCol.setText("Black");
                hebrewNumCol.setText("שחור");
                imageNumCol.setImageResource(R.drawable.black);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_black);
            }
            if (Global.getColor()==1){
                englishNumCol.setText("Blue");
                hebrewNumCol.setText("כחול");
                imageNumCol.setImageResource(R.drawable.blue);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_blue);
            }
            if (Global.getColor()==2){
                englishNumCol.setText("White");
                hebrewNumCol.setText("לבן");
                imageNumCol.setImageResource(R.drawable.white);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_white);
            }
            if (Global.getColor()==3){
                englishNumCol.setText("Pink");
                hebrewNumCol.setText("ורוד");
                imageNumCol.setImageResource(R.drawable.pink);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_pink);
            }
            if (Global.getColor()==4){
                englishNumCol.setText("Yellow");
                hebrewNumCol.setText("צהוב");
                imageNumCol.setImageResource(R.drawable.yellow);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_yellow);
            }
            if (Global.getColor()==5){
                englishNumCol.setText("Grey");
                hebrewNumCol.setText("אפור");
                imageNumCol.setImageResource(R.drawable.grey);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_grey);
            }
            if (Global.getColor()==6){
                englishNumCol.setText("Green");
                hebrewNumCol.setText("ירוק");
                imageNumCol.setImageResource(R.drawable.green);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_green);
            }
            if (Global.getColor()==7){
                englishNumCol.setText("Red");
                hebrewNumCol.setText("אדום");
                imageNumCol.setImageResource(R.drawable.red);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_red);
            }
            if (Global.getColor()==8){
                englishNumCol.setText("Orange");
                hebrewNumCol.setText("כתום");
                imageNumCol.setImageResource(R.drawable.orange);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.orange);
            }
            if (Global.getColor()==9){
                englishNumCol.setText("Brown");
                hebrewNumCol.setText("חום");
                imageNumCol.setImageResource(R.drawable.brown);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.listening_colors_brown);
            }

        }

else if(Global.getCategory()==1) {
            if (num == 0) {
                englishNumCol.setText("Zero");
                hebrewNumCol.setText("אפס");
                imageNumCol.setImageResource(R.drawable.zero);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.zero);
            } else if (num == 1) {
                englishNumCol.setText("One");
                hebrewNumCol.setText("אחד");
                imageNumCol.setImageResource(R.drawable.one);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.one);
            } else if (num == 2) {
                englishNumCol.setText("Two");
                hebrewNumCol.setText("שתים");
                imageNumCol.setImageResource(R.drawable.two);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.two);
            } else if (num == 3) {
                englishNumCol.setText("Three");
                hebrewNumCol.setText("שלוש");
                imageNumCol.setImageResource(R.drawable.three);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.three);
            } else if (num == 4) {
                englishNumCol.setText("Four");
                hebrewNumCol.setText("ארבע");
                imageNumCol.setImageResource(R.drawable.four);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.four);
            } else if (num == 5) {
                englishNumCol.setText("Five");
                hebrewNumCol.setText("חמש");
                imageNumCol.setImageResource(R.drawable.five);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.five);
            } else if (num == 6) {
                englishNumCol.setText("Six");
                hebrewNumCol.setText("שש");
                imageNumCol.setImageResource(R.drawable.six);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.six);
            } else if (num == 7) {
                englishNumCol.setText("Seven");
                hebrewNumCol.setText("שבע");
                imageNumCol.setImageResource(R.drawable.seven);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.seven);
            } else if (num == 8) {
                englishNumCol.setText("Eight");
                hebrewNumCol.setText("שמונה");
                imageNumCol.setImageResource(R.drawable.eight);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.eight);
            } else if (num == 9) {
                englishNumCol.setText("Nine");
                hebrewNumCol.setText("תשע");
                imageNumCol.setImageResource(R.drawable.nine);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.nine);
            } else if (num == 10) {
                englishNumCol.setText("Ten");
                hebrewNumCol.setText("עשר");
                imageNumCol.setImageResource(R.drawable.ten);
                audioNumCol = MediaPlayer.create(SingleNumCol.this, R.raw.ten);
            }
        }

    }

    public void playNumColAudio(View view){
        audioNumCol.start();
    }
}

