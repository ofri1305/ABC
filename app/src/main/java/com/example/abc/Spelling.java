package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Spelling extends AppCompatActivity {
EditText answerInput;
TextView title;
Button ok;
ImageView pic;
String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spelling);
        getSupportActionBar().hide();

         answerInput=  (EditText) findViewById(R.id.editTextTextPersonName);
         title=(TextView) findViewById(R.id.instructionsSpelling);
         ok = (Button) findViewById(R.id.ok);
         pic= (ImageView) findViewById(R.id.imageSpelling);

if(Global.getCategory()==0) {
    title.setText("What is the first letter of the picture?");
    pic.setImageResource(R.drawable.pic_watermelon);
    ok.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer = answerInput.getText().toString();
            if (answer.equals("w") || answer.equals("W")) {

                   greatToast();
                   answerInput.getText().clear();


                pic.setImageResource(R.drawable.pic_hat);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = answerInput.getText().toString();
                        if (answer.equals("h") || answer.equals("H")) {
                            goodJobToast();
                            answerInput.getText().clear();

                            pic.setImageResource(R.drawable.pic_finger);
                            ok.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    answer = answerInput.getText().toString();
                                    if (answer.equals("F") || answer.equals("f")) {
                                        excellentToast();
                                        answerInput.getText().clear();

                                        pic.setImageResource(R.drawable.pic_lemon);
                                        ok.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                answer = answerInput.getText().toString();
                                                if (answer.equals("L") || answer.equals("l")) {
                                                    goodJobToast();
                                                    answerInput.getText().clear();

                                                    pic.setImageResource(R.drawable.pic_jump);
                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            answer = answerInput.getText().toString();
                                                            if (answer.equals("J") || answer.equals("j")) {
                                                                veryGoodToast();
                                                                answerInput.getText().clear();

                                                                pic.setImageResource(R.drawable.pic_queen);
                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        answer = answerInput.getText().toString();
                                                                        if (answer.equals("Q") || answer.equals("q")) {
                                                                            wonderfulToast();
                                                                            answerInput.getText().clear();

                                                                            pic.setImageResource(R.drawable.pic_clock);
                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    answer = answerInput.getText().toString();
                                                                                    if (answer.equals("C") || answer.equals("c")) {
                                                                                        greatToast();
                                                                                        answerInput.getText().clear();


                                                                                        pic.setImageResource(R.drawable.pic_orange);
                                                                                        ok.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                answer = answerInput.getText().toString();
                                                                                                if (answer.equals("O") || answer.equals("o")) {
                                                                                                    excellentToast();
                                                                                                    answerInput.getText().clear();


                                                                                                    pic.setImageResource(R.drawable.pic_table);
                                                                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                                                                        @Override
                                                                                                        public void onClick(View v) {
                                                                                                            answer = answerInput.getText().toString();
                                                                                                            if (answer.equals("t") || answer.equals("T")) {
                                                                                                                veryGoodToast();
                                                                                                                answerInput.getText().clear();


                                                                                                                pic.setImageResource(R.drawable.pic_zebra);
                                                                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        answer = answerInput.getText().toString();
                                                                                                                        if (answer.equals("Z") || answer.equals("z")) {
                                                                                                                            wonderfulToast();
                                                                                                                            answerInput.getText().clear();


                                                                                                                            pic.setImageResource(R.drawable.pic_pencil);
                                                                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                @Override
                                                                                                                                public void onClick(View v) {
                                                                                                                                    answer = answerInput.getText().toString();
                                                                                                                                    if (answer.equals("P") || answer.equals("p")) {
                                                                                                                                        greatToast();
                                                                                                                                        answerInput.getText().clear();


                                                                                                                                        pic.setImageResource(R.drawable.pic_apple);
                                                                                                                                        ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                            @Override
                                                                                                                                            public void onClick(View v) {
                                                                                                                                                answer = answerInput.getText().toString();
                                                                                                                                                if (answer.equals("A") || answer.equals("a")) {
                                                                                                                                                    goodJobToast();
                                                                                                                                                    answerInput.getText().clear();


                                                                                                                                                    pic.setImageResource(R.drawable.pic_eraser);
                                                                                                                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        @Override
                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                            answer = answerInput.getText().toString();
                                                                                                                                                            if (answer.equals("e") || answer.equals("E")) {
                                                                                                                                                                veryGoodToast();
                                                                                                                                                                answerInput.getText().clear();


                                                                                                                                                                pic.setImageResource(R.drawable.pic_yard);
                                                                                                                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                    @Override
                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                        answer = answerInput.getText().toString();
                                                                                                                                                                        if (answer.equals("Y") || answer.equals("y")) {
                                                                                                                                                                            greatToast();
                                                                                                                                                                            answerInput.getText().clear();


                                                                                                                                                                            pic.setImageResource(R.drawable.pic_in);
                                                                                                                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                @Override
                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                    answer = answerInput.getText().toString();
                                                                                                                                                                                    if (answer.equals("i") || answer.equals("I")) {
                                                                                                                                                                                        goodJobToast();
                                                                                                                                                                                        answerInput.getText().clear();


                                                                                                                                                                                        pic.setImageResource(R.drawable.pic_sad);
                                                                                                                                                                                        ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                            @Override
                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                answer = answerInput.getText().toString();
                                                                                                                                                                                                if (answer.equals("S") || answer.equals("s")) {
                                                                                                                                                                                                    wonderfulToast();
                                                                                                                                                                                                    answerInput.getText().clear();


                                                                                                                                                                                                    pic.setImageResource(R.drawable.pic_grapes);
                                                                                                                                                                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        @Override
                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                            answer = answerInput.getText().toString();
                                                                                                                                                                                                            if (answer.equals("G") || answer.equals("g")) {
                                                                                                                                                                                                                excellentToast();
                                                                                                                                                                                                                answerInput.getText().clear();


                                                                                                                                                                                                                pic.setImageResource(R.drawable.pic_xylophone);
                                                                                                                                                                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                        answer = answerInput.getText().toString();
                                                                                                                                                                                                                        if (answer.equals("X") || answer.equals("x")) {
                                                                                                                                                                                                                            greatToast();
                                                                                                                                                                                                                            answerInput.getText().clear();


                                                                                                                                                                                                                            pic.setImageResource(R.drawable.pic_bed);
                                                                                                                                                                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                    answer = answerInput.getText().toString();
                                                                                                                                                                                                                                    if (answer.equals("B") || answer.equals("b")) {
                                                                                                                                                                                                                                        goodJobToast();
                                                                                                                                                                                                                                        answerInput.getText().clear();


                                                                                                                                                                                                                                        pic.setImageResource(R.drawable.pic_motorcycle);
                                                                                                                                                                                                                                        ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                if (answer.equals("M") || answer.equals("m")) {
                                                                                                                                                                                                                                                    excellentToast();
                                                                                                                                                                                                                                                    answerInput.getText().clear();


                                                                                                                                                                                                                                                    pic.setImageResource(R.drawable.pic_vet);
                                                                                                                                                                                                                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                            answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                            if (answer.equals("v") || answer.equals("V")) {
                                                                                                                                                                                                                                                                wonderfulToast();
                                                                                                                                                                                                                                                                answerInput.getText().clear();


                                                                                                                                                                                                                                                                pic.setImageResource(R.drawable.pic_kitchen);
                                                                                                                                                                                                                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                        answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                                        if (answer.equals("K") || answer.equals("k")) {
                                                                                                                                                                                                                                                                            goodJobToast();
                                                                                                                                                                                                                                                                            answerInput.getText().clear();


                                                                                                                                                                                                                                                                            pic.setImageResource(R.drawable.pic_under);
                                                                                                                                                                                                                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                                    answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                                                    if (answer.equals("U") || answer.equals("u")) {
                                                                                                                                                                                                                                                                                        greatToast();
                                                                                                                                                                                                                                                                                        answerInput.getText().clear();


                                                                                                                                                                                                                                                                                        pic.setImageResource(R.drawable.pic_dress);
                                                                                                                                                                                                                                                                                        ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                                                                if (answer.equals("D") || answer.equals("d")) {
                                                                                                                                                                                                                                                                                                    wonderfulToast();
                                                                                                                                                                                                                                                                                                    answerInput.getText().clear();


                                                                                                                                                                                                                                                                                                    pic.setImageResource(R.drawable.pic_nose);
                                                                                                                                                                                                                                                                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                                                            answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                                                                            if (answer.equals("n") || answer.equals("N")) {
                                                                                                                                                                                                                                                                                                                goodJobToast();
                                                                                                                                                                                                                                                                                                                answerInput.getText().clear();


                                                                                                                                                                                                                                                                                                                pic.setImageResource(R.drawable.pic_ruler);
                                                                                                                                                                                                                                                                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                        answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                                                                                        if (answer.equals("R") || answer.equals("r")) {
                                                                                                                                                                                                                                                                                                                            greatToast();
                                                                                                                                                                                                                                                                                                                            answerInput.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                            title.setText("");
                                                                                                                                                                                                                                                                                                                            pic.setImageResource(R.drawable.congratulations);
                                                                                                                                                                                                                                                                                                                            ok.setText("Go back");
                                                                                                                                                                                                                                                                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                    openActivityPlay();
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            });

                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                });


                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    });


                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        });


                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            });


                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                });


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    });


                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        });


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });


                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                });


                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });

                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        });
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                });
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                }
                                                                            });
                                                                        }
                                                                    }
                                                                });
                                                            }
                                                        }
                                                    });
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }
      });
    }

if(Global.getCategory()==1){
    title.setText("Write the number in English!");
    pic.setImageResource(R.drawable.six);

    ok.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer = answerInput.getText().toString();
            if (answer.equals("Six") || answer.equals("six")) {
                greatToast();
                answerInput.getText().clear();

                pic.setImageResource(R.drawable.three);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = answerInput.getText().toString();
                        if (answer.equals("Three") || answer.equals("three")) {
                            excellentToast();
                            answerInput.getText().clear();


                            pic.setImageResource(R.drawable.eight);
                            ok.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    answer = answerInput.getText().toString();
                                    if (answer.equals("Eight") || answer.equals("eight")) {
                                        wonderfulToast();
                                        answerInput.getText().clear();


                                        pic.setImageResource(R.drawable.two);
                                        ok.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                answer = answerInput.getText().toString();
                                                if (answer.equals("Two") || answer.equals("two")) {
                                                    excellentToast();
                                                    answerInput.getText().clear();


                                                    pic.setImageResource(R.drawable.five);
                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            answer = answerInput.getText().toString();
                                                            if (answer.equals("Five") || answer.equals("five")) {
                                                                greatToast();
                                                                answerInput.getText().clear();


                                                                pic.setImageResource(R.drawable.one);
                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        answer = answerInput.getText().toString();
                                                                        if (answer.equals("one") || answer.equals("One")) {
                                                                            goodJobToast();
                                                                            answerInput.getText().clear();


                                                                            pic.setImageResource(R.drawable.seven);
                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    answer = answerInput.getText().toString();
                                                                                    if (answer.equals("seven") || answer.equals("Seven")) {
                                                                                        excellentToast();
                                                                                        answerInput.getText().clear();


                                                                                        pic.setImageResource(R.drawable.zero);
                                                                                        ok.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                answer = answerInput.getText().toString();
                                                                                                if (answer.equals("Zero") || answer.equals("zero")) {
                                                                                                    greatToast();
                                                                                                    answerInput.getText().clear();


                                                                                                    pic.setImageResource(R.drawable.four);
                                                                                                    ok.setOnClickListener(new View.OnClickListener() {
                                                                                                        @Override
                                                                                                        public void onClick(View v) {
                                                                                                            answer = answerInput.getText().toString();
                                                                                                            if (answer.equals("four") || answer.equals("Four")) {
                                                                                                                wonderfulToast();
                                                                                                                answerInput.getText().clear();


                                                                                                                pic.setImageResource(R.drawable.ten);
                                                                                                                ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        answer = answerInput.getText().toString();
                                                                                                                        if (answer.equals("ten") || answer.equals("Ten")) {
                                                                                                                            veryGoodToast();
                                                                                                                            answerInput.getText().clear();


                                                                                                                            pic.setImageResource(R.drawable.nine);
                                                                                                                            ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                @Override
                                                                                                                                public void onClick(View v) {
                                                                                                                                    answer = answerInput.getText().toString();
                                                                                                                                    if (answer.equals("nine") || answer.equals("Nine")) {
                                                                                                                                        goodJobToast();
                                                                                                                                        answerInput.setVisibility(View.INVISIBLE);
                                                                                                                                        title.setText("");
                                                                                                                                        pic.setImageResource(R.drawable.congratulations);
                                                                                                                                        ok.setText("Go back");
                                                                                                                                        ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                            @Override
                                                                                                                                            public void onClick(View v) {
                                                                                                                                                openActivityPlay();
                                                                                                                                            }
                                                                                                                                        });


                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });



                                                                                                                        }
                                                                                                                    }
                                                                                                                });

                                                                                                            }
                                                                                                        }
                                                                                                    });


                                                                                                }
                                                                                            }
                                                                                        });


                                                                                    }
                                                                                }
                                                                            });

                                                                        }
                                                                    }
                                                                });
                                                            }
                                                        }
                                                    });

                                                }
                                            }
                                        });


                                    }
                                }
                            });

                        }
                    }
                });

            }
        }
    });


    
}
      if(Global.getCategory()==2){
          title.setText("Write the color in English!");
          pic.setImageResource(R.drawable.pink);

          ok.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  answer = answerInput.getText().toString();
                  if (answer.equals("pink") || answer.equals("Pink")) {
                      goodJobToast();
                      answerInput.getText().clear();



                      pic.setImageResource(R.drawable.brown);
                      ok.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View v) {
                              answer = answerInput.getText().toString();
                              if (answer.equals("brown") || answer.equals("Brown")) {
                                  greatToast();
                                  answerInput.getText().clear();


                                  pic.setImageResource(R.drawable.orange);
                                  ok.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          answer = answerInput.getText().toString();
                                          if (answer.equals("orange") || answer.equals("Orange")) {
                                              wonderfulToast();
                                              answerInput.getText().clear();


                                              pic.setImageResource(R.drawable.green);
                                              ok.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      answer = answerInput.getText().toString();
                                                      if (answer.equals("green") || answer.equals("Green")) {
                                                          veryGoodToast();
                                                          answerInput.getText().clear();


                                                          pic.setImageResource(R.drawable.grey);
                                                          ok.setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View v) {
                                                                  answer = answerInput.getText().toString();
                                                                  if (answer.equals("grey") || answer.equals("Grey")) {
                                                                      greatToast();
                                                                      answerInput.getText().clear();


                                                                      pic.setImageResource(R.drawable.red);
                                                                      ok.setOnClickListener(new View.OnClickListener() {
                                                                          @Override
                                                                          public void onClick(View v) {
                                                                              answer = answerInput.getText().toString();
                                                                              if (answer.equals("red") || answer.equals("Red")) {
                                                                                  excellentToast();
                                                                                  answerInput.getText().clear();


                                                                                  pic.setImageResource(R.drawable.white);
                                                                                  ok.setOnClickListener(new View.OnClickListener() {
                                                                                      @Override
                                                                                      public void onClick(View v) {
                                                                                          answer = answerInput.getText().toString();
                                                                                          if (answer.equals("White") || answer.equals("white")) {
                                                                                              veryGoodToast();
                                                                                              answerInput.getText().clear();


                                                                                              pic.setImageResource(R.drawable.yellow);
                                                                                              ok.setOnClickListener(new View.OnClickListener() {
                                                                                                  @Override
                                                                                                  public void onClick(View v) {
                                                                                                      answer = answerInput.getText().toString();
                                                                                                      if (answer.equals("Yellow") || answer.equals("yellow")) {
                                                                                                          excellentToast();
                                                                                                          answerInput.getText().clear();


                                                                                                          pic.setImageResource(R.drawable.black);
                                                                                                          ok.setOnClickListener(new View.OnClickListener() {
                                                                                                              @Override
                                                                                                              public void onClick(View v) {
                                                                                                                  answer = answerInput.getText().toString();
                                                                                                                  if (answer.equals("black") || answer.equals("Black")) {
                                                                                                                      wonderfulToast();
                                                                                                                      answerInput.getText().clear();


                                                                                                                      pic.setImageResource(R.drawable.blue);
                                                                                                                      ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                          @Override
                                                                                                                          public void onClick(View v) {
                                                                                                                              answer = answerInput.getText().toString();
                                                                                                                              if (answer.equals("blue") || answer.equals("Blue")) {
                                                                                                                                  greatToast();
                                                                                                                                  answerInput.setVisibility(View.INVISIBLE);
                                                                                                                                  title.setText("");
                                                                                                                                  pic.setImageResource(R.drawable.congratulations);
                                                                                                                                  ok.setText("Go back");
                                                                                                                                  ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                      @Override
                                                                                                                                      public void onClick(View v) {
                                                                                                                                          openActivityPlay();
                                                                                                                                      }
                                                                                                                                  });


                                                                                                                              }
                                                                                                                          }
                                                                                                                      });

                                                                                                                  }
                                                                                                              }
                                                                                                          });

                                                                                                      }
                                                                                                  }
                                                                                              });

                                                                                          }
                                                                                      }
                                                                                  });

                                                                              }
                                                                          }
                                                                      });

                                                                  }
                                                              }
                                                          });

                                                      }
                                                  }
                                              });

                                          }
                                      }
                                  });

                              }
                          }
                      });

                  }
              }
          });


     }

      if(Global.getCategory()==3){
          title.setText("Write the animals' name in English!");

          pic.setImageResource(R.drawable.giraffe);
          ok.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  answer = answerInput.getText().toString();
                  if (answer.equals("giraffe") || answer.equals("Giraffe")) {
                      greatToast();
                      answerInput.getText().clear();


                      pic.setImageResource(R.drawable.snake);
                      ok.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View v) {
                              answer = answerInput.getText().toString();
                              if (answer.equals("snake") || answer.equals("Snake")) {
                                  goodJobToast();
                                  answerInput.getText().clear();


                                  pic.setImageResource(R.drawable.panda);
                                  ok.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          answer = answerInput.getText().toString();
                                          if (answer.equals("panda") || answer.equals("Panda")) {
                                              excellentToast();
                                              answerInput.getText().clear();


                                              pic.setImageResource(R.drawable.monkey);
                                              ok.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      answer = answerInput.getText().toString();
                                                      if (answer.equals("monkey") || answer.equals("Monkey")) {
                                                          wonderfulToast();
                                                          answerInput.getText().clear();


                                                          pic.setImageResource(R.drawable.whale);
                                                          ok.setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View v) {
                                                                  answer = answerInput.getText().toString();
                                                                  if (answer.equals("whale") || answer.equals("Whale")) {
                                                                      greatToast();
                                                                      answerInput.getText().clear();


                                                                      pic.setImageResource(R.drawable.pic_zebra);
                                                                      ok.setOnClickListener(new View.OnClickListener() {
                                                                          @Override
                                                                          public void onClick(View v) {
                                                                              answer = answerInput.getText().toString();
                                                                              if (answer.equals("Zebra") || answer.equals("zebra")) {
                                                                                  goodJobToast();
                                                                                  answerInput.getText().clear();


                                                                                  pic.setImageResource(R.drawable.sheep);
                                                                                  ok.setOnClickListener(new View.OnClickListener() {
                                                                                      @Override
                                                                                      public void onClick(View v) {
                                                                                          answer = answerInput.getText().toString();
                                                                                          if (answer.equals("sheep") || answer.equals("Sheep")) {
                                                                                              excellentToast();
                                                                                              answerInput.getText().clear();


                                                                                              pic.setImageResource(R.drawable.koala);
                                                                                              ok.setOnClickListener(new View.OnClickListener() {
                                                                                                  @Override
                                                                                                  public void onClick(View v) {
                                                                                                      answer = answerInput.getText().toString();
                                                                                                      if (answer.equals("koala") || answer.equals("Koala")) {
                                                                                                          veryGoodToast();
                                                                                                          answerInput.getText().clear();


                                                                                                          pic.setImageResource(R.drawable.dolphin);
                                                                                                          ok.setOnClickListener(new View.OnClickListener() {
                                                                                                              @Override
                                                                                                              public void onClick(View v) {
                                                                                                                  answer = answerInput.getText().toString();
                                                                                                                  if (answer.equals("dolphin") || answer.equals("Dolphin")) {
                                                                                                                      goodJobToast();
                                                                                                                      answerInput.getText().clear();


                                                                                                                      pic.setImageResource(R.drawable.mouse);
                                                                                                                      ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                          @Override
                                                                                                                          public void onClick(View v) {
                                                                                                                              answer = answerInput.getText().toString();
                                                                                                                              if (answer.equals("Mouse") || answer.equals("mouse")) {
                                                                                                                                  greatToast();
                                                                                                                                  answerInput.getText().clear();


                                                                                                                                  pic.setImageResource(R.drawable.shark);
                                                                                                                                  ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                      @Override
                                                                                                                                      public void onClick(View v) {
                                                                                                                                          answer = answerInput.getText().toString();
                                                                                                                                          if (answer.equals("shark") || answer.equals("Shark")) {
                                                                                                                                              wonderfulToast();
                                                                                                                                              answerInput.getText().clear();


                                                                                                                                              pic.setImageResource(R.drawable.horse);
                                                                                                                                              ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                  @Override
                                                                                                                                                  public void onClick(View v) {
                                                                                                                                                      answer = answerInput.getText().toString();
                                                                                                                                                      if (answer.equals("horse") || answer.equals("Horse")) {
                                                                                                                                                          veryGoodToast();
                                                                                                                                                          answerInput.getText().clear();


                                                                                                                                                          pic.setImageResource(R.drawable.pic_elephant);
                                                                                                                                                          ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                              @Override
                                                                                                                                                              public void onClick(View v) {
                                                                                                                                                                  answer = answerInput.getText().toString();
                                                                                                                                                                  if (answer.equals("elephant") || answer.equals("Elephant")) {
                                                                                                                                                                      goodJobToast();
                                                                                                                                                                      answerInput.getText().clear();


                                                                                                                                                                      pic.setImageResource(R.drawable.frog);
                                                                                                                                                                      ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                          @Override
                                                                                                                                                                          public void onClick(View v) {
                                                                                                                                                                              answer = answerInput.getText().toString();
                                                                                                                                                                              if (answer.equals("frog") || answer.equals("Frog")) {
                                                                                                                                                                                  excellentToast();
                                                                                                                                                                                  answerInput.getText().clear();


                                                                                                                                                                                  pic.setImageResource(R.drawable.lion);
                                                                                                                                                                                  ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                      @Override
                                                                                                                                                                                      public void onClick(View v) {
                                                                                                                                                                                          answer = answerInput.getText().toString();
                                                                                                                                                                                          if (answer.equals("lion") || answer.equals("Lion")) {
                                                                                                                                                                                              veryGoodToast();
                                                                                                                                                                                              answerInput.getText().clear();


                                                                                                                                                                                              pic.setImageResource(R.drawable.penguin);
                                                                                                                                                                                              ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                  @Override
                                                                                                                                                                                                  public void onClick(View v) {
                                                                                                                                                                                                      answer = answerInput.getText().toString();
                                                                                                                                                                                                      if (answer.equals("penguin") || answer.equals("Penguin")) {
                                                                                                                                                                                                          goodJobToast();
                                                                                                                                                                                                          answerInput.getText().clear();


                                                                                                                                                                                                          pic.setImageResource(R.drawable.bear);
                                                                                                                                                                                                          ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                              @Override
                                                                                                                                                                                                              public void onClick(View v) {
                                                                                                                                                                                                                  answer = answerInput.getText().toString();
                                                                                                                                                                                                                  if (answer.equals("bear") || answer.equals("Bear")) {
                                                                                                                                                                                                                      excellentToast();
                                                                                                                                                                                                                      answerInput.getText().clear();


                                                                                                                                                                                                                      pic.setImageResource(R.drawable.gorilla);
                                                                                                                                                                                                                      ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                          @Override
                                                                                                                                                                                                                          public void onClick(View v) {
                                                                                                                                                                                                                              answer = answerInput.getText().toString();
                                                                                                                                                                                                                              if (answer.equals("gorilla") || answer.equals("Gorilla")) {
                                                                                                                                                                                                                                  wonderfulToast();
                                                                                                                                                                                                                                  answerInput.getText().clear();


                                                                                                                                                                                                                                  pic.setImageResource(R.drawable.rabbit);
                                                                                                                                                                                                                                  ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                      @Override
                                                                                                                                                                                                                                      public void onClick(View v) {
                                                                                                                                                                                                                                          answer = answerInput.getText().toString();
                                                                                                                                                                                                                                          if (answer.equals("rabbit") || answer.equals("Rabbit")) {
                                                                                                                                                                                                                                              greatToast();
                                                                                                                                                                                                                                              answerInput.getText().clear();


                                                                                                                                                                                                                                              pic.setImageResource(R.drawable.fish);
                                                                                                                                                                                                                                              ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                  @Override
                                                                                                                                                                                                                                                  public void onClick(View v) {
                                                                                                                                                                                                                                                      answer = answerInput.getText().toString();
                                                                                                                                                                                                                                                      if (answer.equals("Fish") || answer.equals("fish")) {
                                                                                                                                                                                                                                                          excellentToast();
                                                                                                                                                                                                                                                          answerInput.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                          title.setText("");
                                                                                                                                                                                                                                                          pic.setImageResource(R.drawable.congratulations);
                                                                                                                                                                                                                                                          ok.setText("Go back");
                                                                                                                                                                                                                                                          ok.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                              @Override
                                                                                                                                                                                                                                                              public void onClick(View v) {
                                                                                                                                                                                                                                                                  openActivityPlay();
                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                          });
                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                              });

                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                  });
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                      });
                                                                                                                                                                                                                  }
                                                                                                                                                                                                              }
                                                                                                                                                                                                          });

                                                                                                                                                                                                      }
                                                                                                                                                                                                  }
                                                                                                                                                                                              });
                                                                                                                                                                                          }
                                                                                                                                                                                      }
                                                                                                                                                                                  });

                                                                                                                                                                              }
                                                                                                                                                                          }
                                                                                                                                                                      });
                                                                                                                                                                  }
                                                                                                                                                              }
                                                                                                                                                          });
                                                                                                                                                      }
                                                                                                                                                  }
                                                                                                                                              });
                                                                                                                                          }
                                                                                                                                      }
                                                                                                                                  });
                                                                                                                              }
                                                                                                                          }
                                                                                                                      });
                                                                                                                  }
                                                                                                              }
                                                                                                          });
                                                                                                      }
                                                                                                  }
                                                                                              });
                                                                                          }
                                                                                      }
                                                                                  });
                                                                              }
                                                                          }
                                                                      });
                                                                  }
                                                              }
                                                          });
                                                      }
                                                  }
                                              });
                                          }
                                      }
                                  });
                              }
                          }
                      });
                  }
              }
          });
      }
    }
    public void greatToast(){
        Toast.makeText(Spelling.this,"Great",Toast.LENGTH_SHORT).show();
    }
    public void goodJobToast(){
        Toast.makeText(Spelling.this,"Good job!",Toast.LENGTH_SHORT).show();
    }
    public void excellentToast(){
        Toast.makeText(Spelling.this,"Excellent!",Toast.LENGTH_SHORT).show();
    }
    public void wonderfulToast(){
        Toast.makeText(Spelling.this,"Wonderful!",Toast.LENGTH_SHORT).show();
    }
    public void veryGoodToast(){
        Toast.makeText(Spelling.this,"Very good!",Toast.LENGTH_SHORT).show();
    }
    public void openActivityPlay(){
        Intent intent1= new Intent(this, Play.class);
        startActivity(intent1);
    }
}