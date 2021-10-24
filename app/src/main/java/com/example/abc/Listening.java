package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Listening extends AppCompatActivity {
    TextView title;
    Button option1, option2,option3, buttonAudio;
    MediaPlayer audio;
    String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);
        getSupportActionBar().hide();


        title= (TextView) findViewById(R.id.instructionsListening);
        option1=(Button) findViewById(R.id.op1Listening);
        option2=(Button) findViewById(R.id.op2Listening);
        option3=(Button) findViewById(R.id.op3Listening);
        buttonAudio=(Button) findViewById(R.id.buttonAudio);

        if(Global.getCategory()==0){
            title.setText("Press on the button and choose the correct answer");

            audio = MediaPlayer.create(Listening.this, R.raw.t);
            option1.setText("x");
            option2.setText("a");
            option3.setText("t");
            answer="t";
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer==option3.getText()){
                        goodJobToast();

                        audio = MediaPlayer.create(Listening.this, R.raw.j);
                        option1.setText("j");
                        option2.setText("p");
                        option3.setText("d");
                        answer="j";
                        option1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(answer==option1.getText()){
                                    amazingToast();

                                    audio = MediaPlayer.create(Listening.this, R.raw.z);
                                    option1.setText("s");
                                    option2.setText("z");
                                    option3.setText("u");
                                    answer="z";
                                    option2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if(answer==option2.getText()){
                                                veryGoodToast();

                                                audio = MediaPlayer.create(Listening.this, R.raw.h);
                                                option1.setText("g");
                                                option2.setText("h");
                                                option3.setText("l");
                                                answer="h";
                                                option2.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(answer==option2.getText()){
                                                            excellentToast();

                                                            audio = MediaPlayer.create(Listening.this, R.raw.m);
                                                            option1.setText("o");
                                                            option2.setText("y");
                                                            option3.setText("m");
                                                            answer="m";
                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    if(answer==option3.getText()){
                                                                        amazingToast();

                                                                        audio = MediaPlayer.create(Listening.this, R.raw.w);
                                                                        option1.setText("w");
                                                                        option2.setText("d");
                                                                        option3.setText("g");
                                                                        answer="w";
                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                if(answer==option1.getText()){
                                                                                    greatToast();

                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.o);
                                                                                    option1.setText("x");
                                                                                    option2.setText("o");
                                                                                    option3.setText("k");
                                                                                    answer="o";
                                                                                    option2.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            if(answer==option2.getText()){
                                                                                                wonderfulToast();

                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.q);
                                                                                                option1.setText("w");
                                                                                                option2.setText("h");
                                                                                                option3.setText("q");
                                                                                                answer="q";
                                                                                                option3.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        if(answer==option3.getText()){
                                                                                                            amazingToast();

                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.u);
                                                                                                            option1.setText("u");
                                                                                                            option2.setText("w");
                                                                                                            option3.setText("g");
                                                                                                            answer="u";
                                                                                                            option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    if(answer==option1.getText()){
                                                                                                                        excellentToast();

                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.y);
                                                                                                                        option1.setText("y");
                                                                                                                        option2.setText("u");
                                                                                                                        option3.setText("n");
                                                                                                                        answer="y";
                                                                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                if(answer==option1.getText()){
                                                                                                                                    goodJobToast();

                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.c);
                                                                                                                                    option1.setText("d");
                                                                                                                                    option2.setText("c");
                                                                                                                                    option3.setText("b");
                                                                                                                                    answer="c";
                                                                                                                                    option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        @Override
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            if(answer==option2.getText()){
                                                                                                                                                excellentToast();

                                                                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.r);
                                                                                                                                                option1.setText("f");
                                                                                                                                                option2.setText("r");
                                                                                                                                                option3.setText("a");
                                                                                                                                                answer="r";
                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                    @Override
                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                        if(answer==option2.getText()){
                                                                                                                                                            greatToast();

                                                                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.x);
                                                                                                                                                            option1.setText("j");
                                                                                                                                                            option2.setText("r");
                                                                                                                                                            option3.setText("x");
                                                                                                                                                            answer="x";
                                                                                                                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                @Override
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    if(answer==option3.getText()){
                                                                                                                                                                        veryGoodToast();

                                                                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.f);
                                                                                                                                                                        option1.setText("f");
                                                                                                                                                                        option2.setText("p");
                                                                                                                                                                        option3.setText("t");
                                                                                                                                                                        answer="f";
                                                                                                                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                            @Override
                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                if(answer==option1.getText()){
                                                                                                                                                                                    greatToast();

                                                                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.i);
                                                                                                                                                                                    option1.setText("i");
                                                                                                                                                                                    option2.setText("j");
                                                                                                                                                                                    option3.setText("v");
                                                                                                                                                                                    answer="i";
                                                                                                                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        @Override
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            if(answer==option1.getText()){
                                                                                                                                                                                                wonderfulToast();

                                                                                                                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.p);
                                                                                                                                                                                                option1.setText("p");
                                                                                                                                                                                                option2.setText("e");
                                                                                                                                                                                                option3.setText("f");
                                                                                                                                                                                                answer="p";
                                                                                                                                                                                                option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                    @Override
                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                        if(answer==option1.getText()){
                                                                                                                                                                                                            excellentToast();

                                                                                                                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.k);
                                                                                                                                                                                                            option1.setText("n");
                                                                                                                                                                                                            option2.setText("k");
                                                                                                                                                                                                            option3.setText("q");
                                                                                                                                                                                                            answer="k";
                                                                                                                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    if(answer==option2.getText()){
                                                                                                                                                                                                                        greatToast();

                                                                                                                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.g);
                                                                                                                                                                                                                        option1.setText("m");
                                                                                                                                                                                                                        option2.setText("g");
                                                                                                                                                                                                                        option3.setText("z");
                                                                                                                                                                                                                        answer="g";
                                                                                                                                                                                                                        option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                if(answer==option2.getText()){
                                                                                                                                                                                                                                    goodJobToast();

                                                                                                                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.e);
                                                                                                                                                                                                                                    option1.setText("f");
                                                                                                                                                                                                                                    option2.setText("l");
                                                                                                                                                                                                                                    option3.setText("e");
                                                                                                                                                                                                                                    answer="e";
                                                                                                                                                                                                                                    option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                            if(answer==option3.getText()){
                                                                                                                                                                                                                                                amazingToast();

                                                                                                                                                                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.a);
                                                                                                                                                                                                                                                option1.setText("a");
                                                                                                                                                                                                                                                option2.setText("p");
                                                                                                                                                                                                                                                option3.setText("r");
                                                                                                                                                                                                                                                answer="a";
                                                                                                                                                                                                                                                option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                        if(answer==option1.getText()){
                                                                                                                                                                                                                                                            wonderfulToast();

                                                                                                                                                                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.b);
                                                                                                                                                                                                                                                            option1.setText("o");
                                                                                                                                                                                                                                                            option2.setText("d");
                                                                                                                                                                                                                                                            option3.setText("b");
                                                                                                                                                                                                                                                            answer="b";
                                                                                                                                                                                                                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                    if(answer==option3.getText()){
                                                                                                                                                                                                                                                                        veryGoodToast();

                                                                                                                                                                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.l);
                                                                                                                                                                                                                                                                        option1.setText("g");
                                                                                                                                                                                                                                                                        option2.setText("a");
                                                                                                                                                                                                                                                                        option3.setText("l");
                                                                                                                                                                                                                                                                        answer="l";
                                                                                                                                                                                                                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                if(answer==option3.getText()){
                                                                                                                                                                                                                                                                                    amazingToast();

                                                                                                                                                                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.n);
                                                                                                                                                                                                                                                                                    option1.setText("n");
                                                                                                                                                                                                                                                                                    option2.setText("h");
                                                                                                                                                                                                                                                                                    option3.setText("m");
                                                                                                                                                                                                                                                                                    answer="n";
                                                                                                                                                                                                                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                                                                            if(answer==option1.getText()){
                                                                                                                                                                                                                                                                                                excellentToast();


                                                                                                                                                                                                                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.s);
                                                                                                                                                                                                                                                                                                option1.setText("m");
                                                                                                                                                                                                                                                                                                option2.setText("s");
                                                                                                                                                                                                                                                                                                option3.setText("w");
                                                                                                                                                                                                                                                                                                answer="s";
                                                                                                                                                                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                        if(answer==option2.getText()){
                                                                                                                                                                                                                                                                                                            goodJobToast();

                                                                                                                                                                                                                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.d);
                                                                                                                                                                                                                                                                                                            option1.setText("b");
                                                                                                                                                                                                                                                                                                            option2.setText("d");
                                                                                                                                                                                                                                                                                                            option3.setText("t");
                                                                                                                                                                                                                                                                                                            answer="d";
                                                                                                                                                                                                                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                    if(answer==option2.getText()){
                                                                                                                                                                                                                                                                                                                        wonderfulToast();

                                                                                                                                                                                                                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.v);
                                                                                                                                                                                                                                                                                                                        option1.setText("v");
                                                                                                                                                                                                                                                                                                                        option2.setText("u");
                                                                                                                                                                                                                                                                                                                        option3.setText("b");
                                                                                                                                                                                                                                                                                                                        answer="v";
                                                                                                                                                                                                                                                                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                if(answer==option1.getText()){
                                                                                                                                                                                                                                                                                                                                    excellentToast();

                                                                                                                                                                                                                                                                                                                                    option1.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                    option2.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                    option3.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                    buttonAudio.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                    title.setTextSize(70);
                                                                                                                                                                                                                                                                                                                                    title.setText("Well done!");

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
            title.setText("Press on the button and choose the correct answer");

            audio = MediaPlayer.create(Listening.this, R.raw.five);
            option1.setText("five");
            option2.setText("zero");
            option3.setText("seven");
            answer="five";
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer==option1.getText()){
                        excellentToast();

                        audio = MediaPlayer.create(Listening.this, R.raw.two);
                        option1.setText("one");
                        option2.setText("ten");
                        option3.setText("two");
                        answer="two";
                        option3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(answer==option3.getText()){
                                    wonderfulToast();

                                    audio = MediaPlayer.create(Listening.this, R.raw.nine);
                                    option1.setText("nine");
                                    option2.setText("six");
                                    option3.setText("three");
                                    answer="nine";
                                    option1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if(answer==option1.getText()){
                                                greatToast();

                                                audio = MediaPlayer.create(Listening.this, R.raw.zero);
                                                option1.setText("eight");
                                                option2.setText("zero");
                                                option3.setText("five");
                                                answer="zero";
                                                option2.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(answer==option2.getText()){
                                                            veryGoodToast();

                                                            audio = MediaPlayer.create(Listening.this, R.raw.seven);
                                                            option1.setText("four");
                                                            option2.setText("seven");
                                                            option3.setText("ten");
                                                            answer="seven";
                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    if(answer==option2.getText()){
                                                                        greatToast();

                                                                        audio = MediaPlayer.create(Listening.this, R.raw.three);
                                                                        option1.setText("three");
                                                                        option2.setText("five");
                                                                        option3.setText("two");
                                                                        answer="three";
                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                if(answer==option1.getText()){
                                                                                    amazingToast();

                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.eight);
                                                                                    option1.setText("zero");
                                                                                    option2.setText("one");
                                                                                    option3.setText("eight");
                                                                                    answer="eight";
                                                                                    option3.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            if(answer==option3.getText()){
                                                                                                wonderfulToast();

                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.six);
                                                                                                option1.setText("seven");
                                                                                                option2.setText("five");
                                                                                                option3.setText("six");
                                                                                                answer="six";
                                                                                                option3.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        if(answer==option3.getText()){
                                                                                                            greatToast();

                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.one);
                                                                                                            option1.setText("eight");
                                                                                                            option2.setText("one");
                                                                                                            option3.setText("ten");
                                                                                                            answer="one";
                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    if(answer==option2.getText()){
                                                                                                                        amazingToast();

                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.ten);
                                                                                                                        option1.setText("ten");
                                                                                                                        option2.setText("five");
                                                                                                                        option3.setText("three");
                                                                                                                        answer="ten";
                                                                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                if(answer==option1.getText()){
                                                                                                                                    veryGoodToast();

                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.four);
                                                                                                                                    option1.setText("nine");
                                                                                                                                    option2.setText("four");
                                                                                                                                    option3.setText("zero");
                                                                                                                                    answer="four";
                                                                                                                                    option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        @Override
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            if(answer==option2.getText()){
                                                                                                                                                goodJobToast();

                                                                                                                                                option1.setVisibility(View.INVISIBLE);
                                                                                                                                                option3.setVisibility(View.INVISIBLE);
                                                                                                                                                option2.setVisibility(View.INVISIBLE);
                                                                                                                                                buttonAudio.setVisibility(View.INVISIBLE);
                                                                                                                                                title.setTextSize(70);
                                                                                                                                                title.setText("Well done!");
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
            title.setText("Press on the button and choose the correct answer");

            audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_pink);
            option1.setText("grey");
            option2.setText("pink");
            option3.setText("orange");
            answer="pink";
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer==option2.getText()){
                        goodJobToast();

                        audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_brown);
                        option1.setText("brown");
                        option2.setText("pink");
                        option3.setText("yellow");
                        answer="brown";
                        option1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(answer==option1.getText()){
                                    amazingToast();

                                    audio = MediaPlayer.create(Listening.this, R.raw.orange);
                                    option1.setText("red");
                                    option2.setText("orange");
                                    option3.setText("white");
                                    answer="orange";
                                    option2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if(answer==option2.getText()){
                                                veryGoodToast();

                                                audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_yellow);
                                                option1.setText("green");
                                                option2.setText("blue");
                                                option3.setText("yellow");
                                                answer="yellow";
                                                option3.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(answer==option3.getText()){
                                                            wonderfulToast();

                                                            audio = MediaPlayer.create(Listening.this, R.raw.seven);
                                                            option1.setText("white");
                                                            option2.setText("grey");
                                                            option3.setText("orange");
                                                            answer="white";
                                                            option1.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    if(answer==option1.getText()){
                                                                        excellentToast();

                                                                        audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_black);
                                                                        option1.setText("pink");
                                                                        option2.setText("black");
                                                                        option3.setText("white");
                                                                        answer="black";
                                                                        option2.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                if(answer==option2.getText()){
                                                                                    goodJobToast();

                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_blue);
                                                                                    option1.setText("blue");
                                                                                    option2.setText("white");
                                                                                    option3.setText("red");
                                                                                    answer="blue";
                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            if(answer==option1.getText()){
                                                                                                amazingToast();

                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_grey);
                                                                                                option1.setText("grey");
                                                                                                option2.setText("yellow");
                                                                                                option3.setText("green");
                                                                                                answer="grey";
                                                                                                option1.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        if(answer==option1.getText()){
                                                                                                            veryGoodToast();

                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_red);
                                                                                                            option1.setText("pink");
                                                                                                            option2.setText("blue");
                                                                                                            option3.setText("red");
                                                                                                            answer="red";
                                                                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    if(answer==option3.getText()){
                                                                                                                        wonderfulToast();

                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.listening_colors_green);
                                                                                                                        option1.setText("blue");
                                                                                                                        option2.setText("green");
                                                                                                                        option3.setText("black");
                                                                                                                        answer="green";
                                                                                                                        option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                if(answer==option2.getText()){
                                                                                                                                    greatToast();

                                                                                                                                    option1.setVisibility(View.INVISIBLE);
                                                                                                                                    option3.setVisibility(View.INVISIBLE);
                                                                                                                                    option2.setVisibility(View.INVISIBLE);
                                                                                                                                    buttonAudio.setVisibility(View.INVISIBLE);
                                                                                                                                    title.setTextSize(70);
                                                                                                                                    title.setText("Well done!");

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
            title.setText("Press on the button and choose the correct answer");

            audio = MediaPlayer.create(Listening.this, R.raw.animals_dolphin);
            option1.setText("lion");
            option2.setText("dolphin");
            option3.setText("rabbit");
            answer="dolphin";
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer==option2.getText()){
                        goodJobToast();

                        audio = MediaPlayer.create(Listening.this, R.raw.animals_sheep);
                        option1.setText("elephant");
                        option2.setText("zebra");
                        option3.setText("sheep");
                        answer="sheep";
                        option3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(answer==option3.getText()){
                                    wonderfulToast();

                                    audio = MediaPlayer.create(Listening.this, R.raw.animals_giraffe);
                                    option1.setText("giraffe");
                                    option2.setText("fish");
                                    option3.setText("snake");
                                    answer="giraffe";
                                    option1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if(answer==option1.getText()){
                                                excellentToast();

                                                audio = MediaPlayer.create(Listening.this, R.raw.animals_whale);
                                                option1.setText("dolphin");
                                                option2.setText("whale");
                                                option3.setText("giraffe");
                                                answer="whale";
                                                option2.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(answer==option2.getText()){
                                                            veryGoodToast();

                                                            audio = MediaPlayer.create(Listening.this, R.raw.animals_snake);
                                                            option1.setText("penguin");
                                                            option2.setText("snake");
                                                            option3.setText("gorilla");
                                                            answer="snake";
                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    if(answer==option2.getText()){
                                                                        amazingToast();

                                                                        audio = MediaPlayer.create(Listening.this, R.raw.animals_koala);
                                                                        option1.setText("zebra");
                                                                        option2.setText("snake");
                                                                        option3.setText("koala");
                                                                        answer="koala";
                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                if(answer==option3.getText()){
                                                                                    goodJobToast();

                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.animals_mouse);
                                                                                    option1.setText("mouse");
                                                                                    option2.setText("rabbit");
                                                                                    option3.setText("elephant");
                                                                                    answer="mouse";
                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            if(answer==option1.getText()){
                                                                                                goodJobToast();

                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.animals_shark);
                                                                                                option1.setText("shark");
                                                                                                option2.setText("mouse");
                                                                                                option3.setText("bear");
                                                                                                answer="shark";
                                                                                                option1.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        if(answer==option1.getText()){
                                                                                                            greatToast();

                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.animals_zebra);
                                                                                                            option1.setText("panda");
                                                                                                            option2.setText("zebra");
                                                                                                            option3.setText("koala");
                                                                                                            answer="zebra";
                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    if(answer==option2.getText()){
                                                                                                                        wonderfulToast();

                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.animals_monkey);
                                                                                                                        option1.setText("whale");
                                                                                                                        option2.setText("sheep");
                                                                                                                        option3.setText("monkey");
                                                                                                                        answer="monkey";
                                                                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                if(answer==option3.getText()){
                                                                                                                                    excellentToast();

                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.animals_rabbit);
                                                                                                                                    option1.setText("fish");
                                                                                                                                    option2.setText("monkey");
                                                                                                                                    option3.setText("rabbit");
                                                                                                                                    answer="rabbit";
                                                                                                                                    option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        @Override
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            if(answer==option3.getText()){
                                                                                                                                                goodJobToast();

                                                                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.animals_lion);
                                                                                                                                                option1.setText("sheep");
                                                                                                                                                option2.setText("lion");
                                                                                                                                                option3.setText("mouse");
                                                                                                                                                answer="lion";
                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                    @Override
                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                        if(answer==option2.getText()){
                                                                                                                                                            amazingToast();

                                                                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.animals_elephant);
                                                                                                                                                            option1.setText("penguin");
                                                                                                                                                            option2.setText("shark");
                                                                                                                                                            option3.setText("elephant");
                                                                                                                                                            answer="elephant";
                                                                                                                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                @Override
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    if(answer==option3.getText()){
                                                                                                                                                                        excellentToast();

                                                                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.animals_horse);
                                                                                                                                                                        option1.setText("horse");
                                                                                                                                                                        option2.setText("gorilla");
                                                                                                                                                                        option3.setText("whale");
                                                                                                                                                                        answer="horse";
                                                                                                                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                            @Override
                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                if(answer==option1.getText()){
                                                                                                                                                                                    wonderfulToast();

                                                                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.animals_bear);
                                                                                                                                                                                    option1.setText("bear");
                                                                                                                                                                                    option2.setText("frog");
                                                                                                                                                                                    option3.setText("snake");
                                                                                                                                                                                    answer="bear";
                                                                                                                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        @Override
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            if(answer==option1.getText()){
                                                                                                                                                                                                amazingToast();

                                                                                                                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.animals_penguin);
                                                                                                                                                                                                option1.setText("frog");
                                                                                                                                                                                                option2.setText("penguin");
                                                                                                                                                                                                option3.setText("bear");
                                                                                                                                                                                                answer="penguin";
                                                                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                    @Override
                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                        if(answer==option2.getText()){
                                                                                                                                                                                                            goodJobToast();

                                                                                                                                                                                                            audio = MediaPlayer.create(Listening.this, R.raw.animals_fish);
                                                                                                                                                                                                            option1.setText("koala");
                                                                                                                                                                                                            option2.setText("dolphin");
                                                                                                                                                                                                            option3.setText("fish");
                                                                                                                                                                                                            answer="fish";
                                                                                                                                                                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    if(answer==option3.getText()){
                                                                                                                                                                                                                        excellentToast();

                                                                                                                                                                                                                        audio = MediaPlayer.create(Listening.this, R.raw.animals_gorilla);
                                                                                                                                                                                                                        option1.setText("rabbit");
                                                                                                                                                                                                                        option2.setText("mouse");
                                                                                                                                                                                                                        option3.setText("gorilla");
                                                                                                                                                                                                                        answer="gorilla";
                                                                                                                                                                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                if(answer==option3.getText()){
                                                                                                                                                                                                                                    veryGoodToast();

                                                                                                                                                                                                                                    audio = MediaPlayer.create(Listening.this, R.raw.animals_panda);
                                                                                                                                                                                                                                    option1.setText("horse");
                                                                                                                                                                                                                                    option2.setText("panda");
                                                                                                                                                                                                                                    option3.setText("shark");
                                                                                                                                                                                                                                    answer="panda";
                                                                                                                                                                                                                                    option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                            if(answer==option2.getText()){
                                                                                                                                                                                                                                                amazingToast();

                                                                                                                                                                                                                                                audio = MediaPlayer.create(Listening.this, R.raw.animals_frog);
                                                                                                                                                                                                                                                option1.setText("frog");
                                                                                                                                                                                                                                                option2.setText("lion");
                                                                                                                                                                                                                                                option3.setText("panda");
                                                                                                                                                                                                                                                answer="frog";
                                                                                                                                                                                                                                                option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                        if(answer==option1.getText()){
                                                                                                                                                                                                                                                            wonderfulToast();

                                                                                                                                                                                                                                                            option1.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                            option3.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                            option2.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                            buttonAudio.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                            title.setTextSize(70);
                                                                                                                                                                                                                                                            title.setText("Well done!");

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
    public void playAudio(View view) {
        audio.start();
    }
    public void greatToast(){
        Toast.makeText(Listening.this,"Great",Toast.LENGTH_SHORT).show();
    }
    public void goodJobToast(){
        Toast.makeText(Listening.this,"Good job!",Toast.LENGTH_SHORT).show();
    }
    public void excellentToast(){
        Toast.makeText(Listening.this,"Excellent!",Toast.LENGTH_SHORT).show();
    }
    public void veryGoodToast(){
        Toast.makeText(Listening.this,"Very good!",Toast.LENGTH_SHORT).show();
    }
    public void wonderfulToast(){
        Toast.makeText(Listening.this,"Wonderful!",Toast.LENGTH_SHORT).show();
    }
    public void amazingToast(){
        Toast.makeText(Listening.this,"Amazing!",Toast.LENGTH_SHORT).show();
    }

}