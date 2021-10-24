package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SingleAnimal extends AppCompatActivity {
    MediaPlayer audioAnimal, soundEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_animal);
        getSupportActionBar().hide();

        int ani = Global.getGlobalIntegerAnimalsList();

        TextView hebrewAni = findViewById(R.id.animalHebrew);
        TextView englishAni = findViewById(R.id.animalEnglish);
        ImageView imageAni = findViewById(R.id.imageAnimal);

            if (ani == 0) {
                englishAni.setText("Bear");
                hebrewAni.setText("דוב");
                imageAni.setImageResource(R.drawable.bear);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_bear);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.bear);

            }
            else if (ani == 1) {
                englishAni.setText("Dolphin");
                hebrewAni.setText("דולפין");
                imageAni.setImageResource(R.drawable.dolphin);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_dolphin);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.dolphin);

            }
            else if (ani == 2) {
                englishAni.setText("Elephant");
                hebrewAni.setText("פיל");
                imageAni.setImageResource(R.drawable.pic_elephant);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_elephant);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.elephant);

            }
            else if (ani == 3) {
                englishAni.setText("Fish");
                hebrewAni.setText("דג");
                imageAni.setImageResource(R.drawable.fish);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_fish);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.fish);

            }
            else if (ani == 4) {
                englishAni.setText("Frog");
                hebrewAni.setText("צפרדע");
                imageAni.setImageResource(R.drawable.frog);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_frog);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.frog);

            }
            else if (ani == 5) {
                englishAni.setText("Giraffe");
                hebrewAni.setText("ג'ירפה");
                imageAni.setImageResource(R.drawable.giraffe);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_giraffe);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.giraffe);

            }
            else if (ani == 6) {
                englishAni.setText("Gorilla");
                hebrewAni.setText("גורילה");
                imageAni.setImageResource(R.drawable.gorilla);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_gorilla);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.gorilla);

            } else if (ani == 7) {
                englishAni.setText("Horse");
                hebrewAni.setText("סוס");
                imageAni.setImageResource(R.drawable.horse);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_horse);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.horse);

            }
            else if (ani == 8) {
                englishAni.setText("Koala");
                hebrewAni.setText("קואלה");
                imageAni.setImageResource(R.drawable.koala);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_koala);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.koala);

            }
            else if (ani == 9) {
                englishAni.setText("Lion");
                hebrewAni.setText("אריה");
                imageAni.setImageResource(R.drawable.lion);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_lion);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.lion);

            }
            else if (ani == 10) {
                englishAni.setText("Monkey");
                hebrewAni.setText("קוף");
                imageAni.setImageResource(R.drawable.monkey);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_monkey);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.monkey);

            }
            else if (ani == 11) {
                englishAni.setText("Mouse");
                hebrewAni.setText("עכבר");
                imageAni.setImageResource(R.drawable.mouse);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_mouse);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.mouse);

            }
            else if (ani == 12) {
                englishAni.setText("Panda");
                hebrewAni.setText("פנדה");
                imageAni.setImageResource(R.drawable.panda);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_panda);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.panda);

            }
            else if (ani == 13) {
                englishAni.setText("Penguin");
                hebrewAni.setText("פינגווין");
                imageAni.setImageResource(R.drawable.penguin);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_penguin);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.penguin);

            }
            else if (ani == 14) {
                englishAni.setText("Rabbit");
                hebrewAni.setText("ארנב");
                imageAni.setImageResource(R.drawable.rabbit);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_rabbit);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.rabbit);

            }
            else if (ani == 15) {
                englishAni.setText("Shark");
                hebrewAni.setText("כריש");
                imageAni.setImageResource(R.drawable.shark);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_shark);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.shark);

            }
            else if (ani == 16) {
                englishAni.setText("Sheep");
                hebrewAni.setText("כבשה");
                imageAni.setImageResource(R.drawable.sheep);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_sheep);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.sheep);

            }
            else if (ani == 17) {
                englishAni.setText("Snake");
                hebrewAni.setText("נחש");
                imageAni.setImageResource(R.drawable.snake);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_snake);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.snake);

            }
            else if (ani == 18) {
                englishAni.setText("Whale");
                hebrewAni.setText("לוייתן");
                imageAni.setImageResource(R.drawable.whale);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_whale);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.whale);

            }
            else if (ani == 19) {
                englishAni.setText("Zebra");
                hebrewAni.setText("זברה");
                imageAni.setImageResource(R.drawable.pic_zebra);
                audioAnimal = MediaPlayer.create(SingleAnimal.this, R.raw.animals_zebra);
                soundEffect = MediaPlayer.create(SingleAnimal.this, R.raw.zebra);

            }

        }


    public void playAnimalAudio(View view) {
        audioAnimal.start();
    }
    public void playSoundEffect(View view) {
        soundEffect.start();
    }

}


