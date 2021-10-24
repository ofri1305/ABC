package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleLetter extends AppCompatActivity {
MediaPlayer letterAudio, photoAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_letter);
        getSupportActionBar().hide();


        TextView capital= findViewById(R.id.textViewCapital);
        TextView small= findViewById(R.id.textViewSmall);
        TextView imageHebrew= findViewById(R.id.textViewHebrew);
        TextView imageEnglish= findViewById(R.id.textViewEnglish);
        ImageView image= findViewById(R.id.imageView);

        int num=Global.getGlobalIntegerLettersList();
        if(num==0){
          capital.setText("A");
          small.setText("a");
          imageHebrew.setText("תפוח");
          imageEnglish.setText("Apple");
          image.setImageResource(R.drawable.pic_apple);
          letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.a);
          photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.apple);

        }
        else if(num==1){
            capital.setText("B");
            small.setText("b");
            imageHebrew.setText("מיטה");
            imageEnglish.setText("Bed");
            image.setImageResource(R.drawable.pic_bed);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.b);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.bed);
        }else if(num==2){
            capital.setText("C");
            small.setText("c");
            imageHebrew.setText("שעון");
            imageEnglish.setText("Clock");
            image.setImageResource(R.drawable.pic_clock);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.c);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.clock);
        }
        else if(num==3){
            capital.setText("D");
            small.setText("d");
            imageHebrew.setText("שמלה");
            imageEnglish.setText("Dress");
            image.setImageResource(R.drawable.pic_dress);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.d);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.dress);
        }
        else if(num==4){
            capital.setText("E");
            small.setText("e");
            imageHebrew.setText("מחק");
            imageEnglish.setText("Eraser");
            image.setImageResource(R.drawable.pic_eraser);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.e);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.eraser);
        }
        else if(num==5){
            capital.setText("F");
            small.setText("f");
            imageHebrew.setText("אצבע");
            imageEnglish.setText("Finger");
            image.setImageResource(R.drawable.pic_finger);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.f);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.finger);
        }
        else if(num==6){
            capital.setText("G");
            small.setText("g");
            imageHebrew.setText("ענבים");
            imageEnglish.setText("Grapes");
            image.setImageResource(R.drawable.pic_grapes);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.g);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.grapes);
        }
        else if(num==7){
            capital.setText("H");
            small.setText("h");
            imageHebrew.setText("כובע");
            imageEnglish.setText("Hat");
            image.setImageResource(R.drawable.pic_hat);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.h);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.hat);
        }
        else if(num==8){
            capital.setText("I");
            small.setText("i");
            imageHebrew.setText("בתוך");
            imageEnglish.setText("In");
            image.setImageResource(R.drawable.pic_in);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.i);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.in);
        }
        else if(num==9){
            capital.setText("J");
            small.setText("j");
            imageHebrew.setText("לקפוץ");
            imageEnglish.setText("Jump");
            image.setImageResource(R.drawable.pic_jump);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.j);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.jump);
        }
        else if(num==10){
            capital.setText("K");
            small.setText("k");
            imageHebrew.setText("מטבח");
            imageEnglish.setText("Kitchen");
            image.setImageResource(R.drawable.pic_kitchen);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.k);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.kitchen);
        }
        else if(num==11){
            capital.setText("L");
            small.setText("l");
            imageHebrew.setText("לימון");
            imageEnglish.setText("Lemon");
            image.setImageResource(R.drawable.pic_lemon);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.l);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.lemon);
        }
        else if(num==12){
            capital.setText("M");
            small.setText("m");
            imageHebrew.setText("שעון");
            imageEnglish.setText("Motorcycle");
            image.setImageResource(R.drawable.pic_motorcycle);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.m);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.motorcycle);
        }
        else if(num==13){
            capital.setText("N");
            small.setText("n");
            imageHebrew.setText("אף");
            imageEnglish.setText("Nose");
            image.setImageResource(R.drawable.pic_nose);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.n);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.nose);
        }
        else if(num==14){
            capital.setText("O");
            small.setText("o");
            imageHebrew.setText("תפוז");
            imageEnglish.setText("Orange");
            image.setImageResource(R.drawable.pic_orange);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.o);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.orange);
        }
        else if(num==15){
            capital.setText("P");
            small.setText("p");
            imageHebrew.setText("עפרון");
            imageEnglish.setText("Pencil");
            image.setImageResource(R.drawable.pic_pencil);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.p);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.pencil);
        }
        else if(num==16){
            capital.setText("Q");
            small.setText("q");
            imageHebrew.setText("מלכה");
            imageEnglish.setText("Queen");
            image.setImageResource(R.drawable.pic_queen);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.q);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.queen);
        }
        else if(num==17){
            capital.setText("R");
            small.setText("r");
            imageHebrew.setText("סרגל");
            imageEnglish.setText("Ruler");
            image.setImageResource(R.drawable.pic_ruler);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.r);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.ruler);
        }
        else if(num==18){
            capital.setText("S");
            small.setText("s");
            imageHebrew.setText("עצוב");
            imageEnglish.setText("Sad");
            image.setImageResource(R.drawable.pic_sad);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.s);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.sad);
        }
        else if(num==19){
            capital.setText("T");
            small.setText("t");
            imageHebrew.setText("שולחן");
            imageEnglish.setText("Table");
            image.setImageResource(R.drawable.pic_table);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.t);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.table);
        }
        else if(num==20){
            capital.setText("U");
            small.setText("u");
            imageHebrew.setText("מתחת");
            imageEnglish.setText("Under");
            image.setImageResource(R.drawable.pic_under);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.u);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.under);
        }
        else if(num==21){
            capital.setText("V");
            small.setText("v");
            imageHebrew.setText("וטרינר");
            imageEnglish.setText("Vet");
            image.setImageResource(R.drawable.pic_vet);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.v);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.vet);
        }
        else if(num==22){
            capital.setText("W");
            small.setText("w");
            imageHebrew.setText("אבטיח");
            imageEnglish.setText("Watermelon");
            image.setImageResource(R.drawable.pic_watermelon);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.w);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.watermelon);
        }
        else if(num==23){
            capital.setText("X");
            small.setText("x");
            imageHebrew.setText("קסילופון");
            imageEnglish.setText("Xylophone");
            image.setImageResource(R.drawable.pic_xylophone);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.x);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.xylophone);
        }
        else if(num==24){
            capital.setText("Y");
            small.setText("y");
            imageHebrew.setText("חצר");
            imageEnglish.setText("Yard");
            image.setImageResource(R.drawable.pic_yard);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.y);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.yard);
        }
        else if(num==25){
            capital.setText("Z");
            small.setText("z");
            imageHebrew.setText("זברה");
            imageEnglish.setText("Zebra");
            image.setImageResource(R.drawable.pic_zebra);
            letterAudio=MediaPlayer.create(SingleLetter.this, R.raw.z);
            photoAudio=MediaPlayer.create(SingleLetter.this, R.raw.animals_zebra);
        }


    }
    public void playLetterAudio(View view){
        letterAudio.start();
}
    public void playPhotoAudio(View view){
        photoAudio.start();
    }


}