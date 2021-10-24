package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class LearnLetNumAni extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_let_num_ani);

        getSupportActionBar().hide();


        TextView title= findViewById(R.id.titleList);

        if(Global.getCategory()==1){


            title.setText("Which number do you want to learn?");
            listView=(ListView) findViewById(R.id.learnList);
            String[] listNumbers= new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            ArrayAdapter adapter= new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,listNumbers);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position==0){
                        Global.setGlobalIntegerNumbersList(0);
                        Intent myIntent= new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent,0);

                    }
                    else if (position == 1) {
                        Global.setGlobalIntegerNumbersList(1);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 1);
                    }
                    else if (position == 2) {
                        Global.setGlobalIntegerNumbersList(2);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 2);
                    }
                    else if (position == 3) {
                        Global.setGlobalIntegerNumbersList(3);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 3);
                    }
                    else if (position == 4) {
                        Global.setGlobalIntegerNumbersList(4);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 4);
                    }
                    else if (position == 5) {
                        Global.setGlobalIntegerNumbersList(5);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 5);
                    }
                    else if (position == 6) {
                        Global.setGlobalIntegerNumbersList(6);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 6);
                    }
                    else if (position == 7) {
                        Global.setGlobalIntegerNumbersList(7);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 7);
                    }
                    else if (position == 8) {
                        Global.setGlobalIntegerNumbersList(8);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 8);
                    }
                    else if (position == 9) {
                        Global.setGlobalIntegerNumbersList(9);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 9);
                    }
                    else if (position == 10) {
                        Global.setGlobalIntegerNumbersList(10);
                        Intent myIntent = new Intent(view.getContext(), SingleNumCol.class);
                        startActivityForResult(myIntent, 10);
                    }

                }
            });


        }
   if(Global.getCategory()==0) {
       title.setText("Which letter do you want to learn?");
      listView = (ListView) findViewById(R.id.learnList);
      String[] listLetters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
              "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

      ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, listLetters);
      listView.setAdapter(adapter);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              if (position == 0) {
                  Global.setGlobalIntegerLettersList(0);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 0);

              } else if (position == 1) {
                  Global.setGlobalIntegerLettersList(1);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 1);
              } else if (position == 2) {
                  Global.setGlobalIntegerLettersList(2);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 2);
              } else if (position == 3) {
                  Global.setGlobalIntegerLettersList(3);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 3);
              } else if (position == 4) {
                  Global.setGlobalIntegerLettersList(4);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 4);
              } else if (position == 5) {
                  Global.setGlobalIntegerLettersList(5);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 5);
              } else if (position == 6) {
                  Global.setGlobalIntegerLettersList(6);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 6);
              } else if (position == 7) {
                  Global.setGlobalIntegerLettersList(7);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 7);
              } else if (position == 8) {
                  Global.setGlobalIntegerLettersList(8);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 8);
              } else if (position == 9) {
                  Global.setGlobalIntegerLettersList(9);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 9);
              } else if (position == 10) {
                  Global.setGlobalIntegerLettersList(10);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 10);
              } else if (position == 11) {
                  Global.setGlobalIntegerLettersList(11);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 11);
              } else if (position == 12) {
                  Global.setGlobalIntegerLettersList(12);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 12);
              } else if (position == 13) {
                  Global.setGlobalIntegerLettersList(13);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 13);
              } else if (position == 14) {
                  Global.setGlobalIntegerLettersList(14);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 14);
              } else if (position == 15) {
                  Global.setGlobalIntegerLettersList(15);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 15);
              } else if (position == 16) {
                  Global.setGlobalIntegerLettersList(16);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 16);
              } else if (position == 17) {
                  Global.setGlobalIntegerLettersList(17);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 17);
              } else if (position == 18) {
                  Global.setGlobalIntegerLettersList(18);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 18);
              } else if (position == 19) {
                  Global.setGlobalIntegerLettersList(19);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 19);
              } else if (position == 20) {
                  Global.setGlobalIntegerLettersList(20);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 20);
              } else if (position == 21) {
                  Global.setGlobalIntegerLettersList(21);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 21);
              } else if (position == 22) {
                  Global.setGlobalIntegerLettersList(22);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 22);
              } else if (position == 23) {
                  Global.setGlobalIntegerLettersList(23);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 23);
              } else if (position == 24) {
                  Global.setGlobalIntegerLettersList(24);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 24);
              } else if (position == 25) {
                  Global.setGlobalIntegerLettersList(25);
                  Intent myIntent = new Intent(view.getContext(), SingleLetter.class);
                  startActivityForResult(myIntent, 25);
              }


             }
      });

     }

  if(Global.getCategory()==3) {
      title.setText("Which animal do you want to learn?");
      listView = (ListView) findViewById(R.id.learnList);
      String[] listAnimals = new String[]{"Bear", "Dolphin", "Elephant", "Fish", "Frog", "Giraffe", "Gorilla", "Horse", "Koala",
              "Lion", "Monkey", "Mouse", "Panda", "Penguin", "Rabbit", "Shark",
              "Sheep", "Snake", "Whale", "Zebra"};
      ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, listAnimals);
      listView.setAdapter(adapter);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              if (position == 0) {
                  Global.setGlobalIntegerAnimalsList(0);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 0);
              } else if (position == 1) {
                  Global.setGlobalIntegerAnimalsList(1);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 1);
              } else if (position == 2) {
                  Global.setGlobalIntegerAnimalsList(2);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 2);
              } else if (position == 3) {
                  Global.setGlobalIntegerAnimalsList(3);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 3);
              } else if (position == 4) {
                  Global.setGlobalIntegerAnimalsList(4);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 4);
              } else if (position == 5) {
                  Global.setGlobalIntegerAnimalsList(5);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 5);
              } else if (position == 6) {
                  Global.setGlobalIntegerAnimalsList(6);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 6);
              } else if (position == 7) {
                  Global.setGlobalIntegerAnimalsList(7);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 7);
              } else if (position == 8) {
                  Global.setGlobalIntegerAnimalsList(8);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 8);
              } else if (position == 9) {
                  Global.setGlobalIntegerAnimalsList(9);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 9);
              } else if (position == 10) {
                  Global.setGlobalIntegerAnimalsList(10);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 0);
              } else if (position == 11) {
                  Global.setGlobalIntegerAnimalsList(11);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 11);
              } else if (position == 12) {
                  Global.setGlobalIntegerAnimalsList(12);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 12);
              } else if (position == 13) {
                  Global.setGlobalIntegerAnimalsList(13);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 13);
              } else if (position == 14) {
                  Global.setGlobalIntegerAnimalsList(14);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 14);
              } else if (position == 15) {
                  Global.setGlobalIntegerAnimalsList(15);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 15);
              } else if (position == 16) {
                  Global.setGlobalIntegerAnimalsList(16);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 16);
              } else if (position == 17) {
                  Global.setGlobalIntegerAnimalsList(17);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 17);
              } else if (position == 18) {
                  Global.setGlobalIntegerAnimalsList(18);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 18);
              } else if (position == 19) {
                  Global.setGlobalIntegerAnimalsList(19);
                  Intent myIntent = new Intent(view.getContext(), SingleAnimal.class);
                  startActivityForResult(myIntent, 19);
              }
          }
      });

     }
    }
}