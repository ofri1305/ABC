package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Match extends AppCompatActivity {
    TextView title;
    Button option1, option2,option3;
    ImageView pic;
    String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        getSupportActionBar().hide();

        title= (TextView) findViewById(R.id.instructionsMatch);
       option1=(Button) findViewById(R.id.op1Match);
       option2=(Button) findViewById(R.id.op2Match);
         option3=(Button) findViewById(R.id.op3Match);
         pic= (ImageView) findViewById(R.id.imageViewMatch);

        if(Global.getCategory()==0){

            title.setText("Choose the small letter");

            pic.setImageResource(R.drawable.a);
            option1.setText("g");
            option2.setText("a");
            option3.setText("l");
            answer="a";
            option2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(answer==option2.getText()){
                       wonderfulToast();

                       pic.setImageResource(R.drawable.j);
                       option1.setText("j");
                       option2.setText("p");
                       option3.setText("d");
                       answer="j";
                       option1.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {
                               if(answer==option1.getText()){
                                   amazingToast();

                                   pic.setImageResource(R.drawable.t);
                                   option1.setText("x");
                                   option2.setText("a");
                                   option3.setText("t");
                                   answer="t";
                                   option3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           if(answer==option3.getText()){
                                               veryGoodToast();

                                               pic.setImageResource(R.drawable.z);
                                               option1.setText("s");
                                               option2.setText("z");
                                               option3.setText("u");
                                               answer="z";
                                               option2.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       if(answer==option2.getText()){
                                                           excellentToast();

                                                           pic.setImageResource(R.drawable.m);
                                                           option1.setText("o");
                                                           option2.setText("y");
                                                           option3.setText("m");
                                                           answer="m";
                                                           option3.setOnClickListener(new View.OnClickListener() {
                                                               @Override
                                                               public void onClick(View v) {
                                                                   if(answer==option3.getText()){
                                                                       amazingToast();

                                                                       pic.setImageResource(R.drawable.w);
                                                                       option1.setText("w");
                                                                       option2.setText("d");
                                                                       option3.setText("g");
                                                                       answer="w";
                                                                       option1.setOnClickListener(new View.OnClickListener() {
                                                                           @Override
                                                                           public void onClick(View v) {
                                                                               if(answer==option1.getText()){
                                                                                   greatToast();

                                                                                   pic.setImageResource(R.drawable.o);
                                                                                   option1.setText("x");
                                                                                   option2.setText("o");
                                                                                   option3.setText("k");
                                                                                   answer="o";
                                                                                   option2.setOnClickListener(new View.OnClickListener() {
                                                                                       @Override
                                                                                       public void onClick(View v) {
                                                                                           if(answer==option2.getText()){
                                                                                               goodJobToast();

                                                                                               pic.setImageResource(R.drawable.q);
                                                                                               option1.setText("w");
                                                                                               option2.setText("h");
                                                                                               option3.setText("q");
                                                                                               answer="q";
                                                                                               option3.setOnClickListener(new View.OnClickListener() {
                                                                                                   @Override
                                                                                                   public void onClick(View v) {
                                                                                                       if(answer==option3.getText()){
                                                                                                           wonderfulToast();

                                                                                                           pic.setImageResource(R.drawable.u);
                                                                                                           option1.setText("u");
                                                                                                           option2.setText("w");
                                                                                                           option3.setText("g");
                                                                                                           answer="u";
                                                                                                           option1.setOnClickListener(new View.OnClickListener() {
                                                                                                               @Override
                                                                                                               public void onClick(View v) {
                                                                                                                   if(answer==option1.getText()){
                                                                                                                       excellentToast();

                                                                                                                       pic.setImageResource(R.drawable.y);
                                                                                                                       option1.setText("y");
                                                                                                                       option2.setText("u");
                                                                                                                       option3.setText("n");
                                                                                                                       answer="y";
                                                                                                                       option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                           @Override
                                                                                                                           public void onClick(View v) {
                                                                                                                               if(answer==option1.getText()){
                                                                                                                                   goodJobToast();

                                                                                                                                   pic.setImageResource(R.drawable.r);
                                                                                                                                   option1.setText("f");
                                                                                                                                   option2.setText("r");
                                                                                                                                   option3.setText("a");
                                                                                                                                   answer="r";
                                                                                                                                   option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                       @Override
                                                                                                                                       public void onClick(View v) {
                                                                                                                                           if(answer==option2.getText()){
                                                                                                                                               excellentToast();

                                                                                                                                               pic.setImageResource(R.drawable.c);
                                                                                                                                               option1.setText("d");
                                                                                                                                               option2.setText("c");
                                                                                                                                               option3.setText("b");
                                                                                                                                               answer="c";
                                                                                                                                               option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                   @Override
                                                                                                                                                   public void onClick(View v) {
                                                                                                                                                       if(answer==option2.getText()){
                                                                                                                                                           greatToast();

                                                                                                                                                           pic.setImageResource(R.drawable.x);
                                                                                                                                                           option1.setText("j");
                                                                                                                                                           option2.setText("r");
                                                                                                                                                           option3.setText("x");
                                                                                                                                                           answer="x";
                                                                                                                                                           option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                               @Override
                                                                                                                                                               public void onClick(View v) {
                                                                                                                                                                   if(answer==option3.getText()){
                                                                                                                                                                       wonderfulToast();

                                                                                                                                                                       pic.setImageResource(R.drawable.f);
                                                                                                                                                                       option1.setText("f");
                                                                                                                                                                       option2.setText("p");
                                                                                                                                                                       option3.setText("t");
                                                                                                                                                                       answer="f";
                                                                                                                                                                       option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                           @Override
                                                                                                                                                                           public void onClick(View v) {
                                                                                                                                                                               if(answer==option1.getText()){
                                                                                                                                                                                   greatToast();

                                                                                                                                                                                   pic.setImageResource(R.drawable.k);
                                                                                                                                                                                   option1.setText("n");
                                                                                                                                                                                   option2.setText("k");
                                                                                                                                                                                   option3.setText("q");
                                                                                                                                                                                   answer="k";
                                                                                                                                                                                   option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                       @Override
                                                                                                                                                                                       public void onClick(View v) {
                                                                                                                                                                                           if(answer==option2.getText()){
                                                                                                                                                                                               amazingToast();

                                                                                                                                                                                               pic.setImageResource(R.drawable.p);
                                                                                                                                                                                               option1.setText("p");
                                                                                                                                                                                               option2.setText("e");
                                                                                                                                                                                               option3.setText("f");
                                                                                                                                                                                               answer="p";
                                                                                                                                                                                               option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                   @Override
                                                                                                                                                                                                   public void onClick(View v) {
                                                                                                                                                                                                       if(answer==option1.getText()){
                                                                                                                                                                                                           excellentToast();

                                                                                                                                                                                                           pic.setImageResource(R.drawable.i);
                                                                                                                                                                                                           option1.setText("i");
                                                                                                                                                                                                           option2.setText("j");
                                                                                                                                                                                                           option3.setText("v");
                                                                                                                                                                                                           answer="i";
                                                                                                                                                                                                           option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                               @Override
                                                                                                                                                                                                               public void onClick(View v) {
                                                                                                                                                                                                                   if(answer==option1.getText()){
                                                                                                                                                                                                                       greatToast();

                                                                                                                                                                                                                       pic.setImageResource(R.drawable.g);
                                                                                                                                                                                                                       option1.setText("m");
                                                                                                                                                                                                                       option2.setText("g");
                                                                                                                                                                                                                       option3.setText("z");
                                                                                                                                                                                                                       answer="g";
                                                                                                                                                                                                                       option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                           @Override
                                                                                                                                                                                                                           public void onClick(View v) {
                                                                                                                                                                                                                               if(answer==option2.getText()){
                                                                                                                                                                                                                                   goodJobToast();

                                                                                                                                                                                                                                   pic.setImageResource(R.drawable.e);
                                                                                                                                                                                                                                   option1.setText("f");
                                                                                                                                                                                                                                   option2.setText("l");
                                                                                                                                                                                                                                   option3.setText("e");
                                                                                                                                                                                                                                   answer="e";
                                                                                                                                                                                                                                   option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                       @Override
                                                                                                                                                                                                                                       public void onClick(View v) {
                                                                                                                                                                                                                                           if(answer==option3.getText()){
                                                                                                                                                                                                                                               wonderfulToast();

                                                                                                                                                                                                                                               pic.setImageResource(R.drawable.h);
                                                                                                                                                                                                                                               option1.setText("h");
                                                                                                                                                                                                                                               option2.setText("p");
                                                                                                                                                                                                                                               option3.setText("r");
                                                                                                                                                                                                                                               answer="h";
                                                                                                                                                                                                                                               option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                   @Override
                                                                                                                                                                                                                                                   public void onClick(View v) {
                                                                                                                                                                                                                                                       if(answer==option1.getText()){
                                                                                                                                                                                                                                                           excellentToast();

                                                                                                                                                                                                                                                           pic.setImageResource(R.drawable.b);
                                                                                                                                                                                                                                                           option1.setText("o");
                                                                                                                                                                                                                                                           option2.setText("d");
                                                                                                                                                                                                                                                           option3.setText("b");
                                                                                                                                                                                                                                                           answer="b";
                                                                                                                                                                                                                                                           option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                               @Override
                                                                                                                                                                                                                                                               public void onClick(View v) {
                                                                                                                                                                                                                                                                   if(answer==option3.getText()){
                                                                                                                                                                                                                                                                       veryGoodToast();

                                                                                                                                                                                                                                                                       pic.setImageResource(R.drawable.s);
                                                                                                                                                                                                                                                                       option1.setText("m");
                                                                                                                                                                                                                                                                       option2.setText("s");
                                                                                                                                                                                                                                                                       option3.setText("w");
                                                                                                                                                                                                                                                                       answer="s";
                                                                                                                                                                                                                                                                       option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                           @Override
                                                                                                                                                                                                                                                                           public void onClick(View v) {
                                                                                                                                                                                                                                                                               if(answer==option2.getText()){
                                                                                                                                                                                                                                                                                   amazingToast();

                                                                                                                                                                                                                                                                                   pic.setImageResource(R.drawable.n);
                                                                                                                                                                                                                                                                                   option1.setText("n");
                                                                                                                                                                                                                                                                                   option2.setText("h");
                                                                                                                                                                                                                                                                                   option3.setText("m");
                                                                                                                                                                                                                                                                                   answer="n";
                                                                                                                                                                                                                                                                                   option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                       @Override
                                                                                                                                                                                                                                                                                       public void onClick(View v) {
                                                                                                                                                                                                                                                                                           if(answer==option1.getText()){
                                                                                                                                                                                                                                                                                               excellentToast();

                                                                                                                                                                                                                                                                                               pic.setImageResource(R.drawable.l);
                                                                                                                                                                                                                                                                                               option1.setText("g");
                                                                                                                                                                                                                                                                                               option2.setText("a");
                                                                                                                                                                                                                                                                                               option3.setText("l");
                                                                                                                                                                                                                                                                                               answer="l";
                                                                                                                                                                                                                                                                                               option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                   @Override
                                                                                                                                                                                                                                                                                                   public void onClick(View v) {
                                                                                                                                                                                                                                                                                                       if(answer==option3.getText()){
                                                                                                                                                                                                                                                                                                           wonderfulToast();

                                                                                                                                                                                                                                                                                                           pic.setImageResource(R.drawable.d);
                                                                                                                                                                                                                                                                                                           option1.setText("b");
                                                                                                                                                                                                                                                                                                           option2.setText("d");
                                                                                                                                                                                                                                                                                                           option3.setText("t");
                                                                                                                                                                                                                                                                                                           answer="d";
                                                                                                                                                                                                                                                                                                           option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                               @Override
                                                                                                                                                                                                                                                                                                               public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                   if(answer==option2.getText()){
                                                                                                                                                                                                                                                                                                                       veryGoodToast();

                                                                                                                                                                                                                                                                                                                       pic.setImageResource(R.drawable.v);
                                                                                                                                                                                                                                                                                                                       option1.setText("v");
                                                                                                                                                                                                                                                                                                                       option2.setText("u");
                                                                                                                                                                                                                                                                                                                       option3.setText("b");
                                                                                                                                                                                                                                                                                                                       answer="v";
                                                                                                                                                                                                                                                                                                                       option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                           @Override
                                                                                                                                                                                                                                                                                                                           public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                               if(answer==option1.getText()){
                                                                                                                                                                                                                                                                                                                                   excellentToast();

                                                                                                                                                                                                                                                                                                                                   pic.setImageResource(R.drawable.congratulations);
                                                                                                                                                                                                                                                                                                                                   option1.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                   option3.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                   title.setText("");
                                                                                                                                                                                                                                                                                                                                   option2.setText("Go back");
                                                                                                                                                                                                                                                                                                                                   option2.setOnClickListener(new View.OnClickListener() {
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
            title.setText("Choose the correct number");

            pic.setImageResource(R.drawable.five);
            option1.setText("five");
            option2.setText("zero");
            option3.setText("seven");
            answer="five";
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer==option1.getText()){
                        excellentToast();

                        pic.setImageResource(R.drawable.two);
                        option1.setText("one");
                        option2.setText("ten");
                        option3.setText("two");
                        answer="two";
                        option3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(answer==option3.getText()){
                                    goodJobToast();

                                    pic.setImageResource(R.drawable.nine);
                                    option1.setText("nine");
                                    option2.setText("six");
                                    option3.setText("three");
                                    answer="nine";
                                    option1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if(answer==option1.getText()){
                                                greatToast();

                                                pic.setImageResource(R.drawable.zero);
                                                option1.setText("eight");
                                                option2.setText("zero");
                                                option3.setText("five");
                                                answer="zero";
                                                option2.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(answer==option2.getText()){
                                                            wonderfulToast();

                                                            pic.setImageResource(R.drawable.seven);
                                                            option1.setText("four");
                                                            option2.setText("seven");
                                                            option3.setText("ten");
                                                            answer="seven";
                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    if(answer==option2.getText()){
                                                                        greatToast();

                                                                        pic.setImageResource(R.drawable.three);
                                                                        option1.setText("three");
                                                                        option2.setText("five");
                                                                        option3.setText("two");
                                                                        answer="three";
                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                if(answer==option1.getText()){
                                                                                    amazingToast();

                                                                                    pic.setImageResource(R.drawable.eight);
                                                                                    option1.setText("zero");
                                                                                    option2.setText("one");
                                                                                    option3.setText("eight");
                                                                                    answer="eight";
                                                                                    option3.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            if(answer==option3.getText()){
                                                                                                veryGoodToast();

                                                                                                pic.setImageResource(R.drawable.six);
                                                                                                option1.setText("seven");
                                                                                                option2.setText("five");
                                                                                                option3.setText("six");
                                                                                                answer="six";
                                                                                                option3.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        if(answer==option3.getText()){
                                                                                                            greatToast();

                                                                                                            pic.setImageResource(R.drawable.one);
                                                                                                            option1.setText("eight");
                                                                                                            option2.setText("one");
                                                                                                            option3.setText("ten");
                                                                                                            answer="one";
                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    if(answer==option2.getText()){
                                                                                                                        amazingToast();

                                                                                                                        pic.setImageResource(R.drawable.ten);
                                                                                                                        option1.setText("ten");
                                                                                                                        option2.setText("five");
                                                                                                                        option3.setText("three");
                                                                                                                        answer="ten";
                                                                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                if(answer==option1.getText()){
                                                                                                                                    veryGoodToast();

                                                                                                                                    pic.setImageResource(R.drawable.four);
                                                                                                                                    option1.setText("nine");
                                                                                                                                    option2.setText("four");
                                                                                                                                    option3.setText("zero");
                                                                                                                                    answer="four";
                                                                                                                                    option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        @Override
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            if(answer==option2.getText()){
                                                                                                                                                wonderfulToast();

                                                                                                                                                pic.setImageResource(R.drawable.congratulations);
                                                                                                                                                option1.setVisibility(View.INVISIBLE);
                                                                                                                                                option3.setVisibility(View.INVISIBLE);
                                                                                                                                                title.setText("");
                                                                                                                                                option2.setText("Go back");
                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
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
            title.setText("Choose the correct color");

            pic.setImageResource(R.drawable.orange);
            option1.setText("red");
            option2.setText("orange");
            option3.setText("white");
            answer="orange";
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer==option2.getText()){
                        goodJobToast();

                        pic.setImageResource(R.drawable.brown);
                        option1.setText("brown");
                        option2.setText("pink");
                        option3.setText("yellow");
                        answer="brown";
                        option1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(answer==option1.getText()){
                                    amazingToast();

                                    pic.setImageResource(R.drawable.pink);
                                    option1.setText("grey");
                                    option2.setText("pink");
                                    option3.setText("orange");
                                    answer="pink";
                                    option2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if(answer==option2.getText()){
                                                veryGoodToast();

                                                pic.setImageResource(R.drawable.yellow);
                                                option1.setText("green");
                                                option2.setText("blue");
                                                option3.setText("yellow");
                                                answer="yellow";
                                                option3.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(answer==option3.getText()){
                                                            wonderfulToast();

                                                            pic.setImageResource(R.drawable.blue);
                                                            option1.setText("blue");
                                                            option2.setText("white");
                                                            option3.setText("red");
                                                            answer="blue";
                                                            option1.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    if(answer==option1.getText()){
                                                                        excellentToast();

                                                                        pic.setImageResource(R.drawable.black);
                                                                        option1.setText("pink");
                                                                        option2.setText("black");
                                                                        option3.setText("white");
                                                                        answer="black";
                                                                        option2.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                if(answer==option2.getText()){
                                                                                    goodJobToast();

                                                                                    pic.setImageResource(R.drawable.white);
                                                                                    option1.setText("white");
                                                                                    option2.setText("grey");
                                                                                    option3.setText("orange");
                                                                                    answer="white";
                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            if(answer==option1.getText()){
                                                                                                amazingToast();

                                                                                                pic.setImageResource(R.drawable.grey);
                                                                                                option1.setText("grey");
                                                                                                option2.setText("yellow");
                                                                                                option3.setText("green");
                                                                                                answer="grey";
                                                                                                option1.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        if(answer==option1.getText()){
                                                                                                            wonderfulToast();

                                                                                                            pic.setImageResource(R.drawable.green);
                                                                                                            option1.setText("blue");
                                                                                                            option2.setText("green");
                                                                                                            option3.setText("black");
                                                                                                            answer="green";
                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    if(answer==option2.getText()){
                                                                                                                        excellentToast();

                                                                                                                        pic.setImageResource(R.drawable.red);
                                                                                                                        option1.setText("pink");
                                                                                                                        option2.setText("blue");
                                                                                                                        option3.setText("red");
                                                                                                                        answer="red";
                                                                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                if(answer==option3.getText()){
                                                                                                                                    greatToast();

                                                                                                                                    pic.setImageResource(R.drawable.congratulations);
                                                                                                                                    option1.setVisibility(View.INVISIBLE);
                                                                                                                                    option3.setVisibility(View.INVISIBLE);
                                                                                                                                    title.setText("");
                                                                                                                                    option2.setText("Go back");
                                                                                                                                    option2.setOnClickListener(new View.OnClickListener() {
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
            title.setText("Choose the correct animal");

            pic.setImageResource(R.drawable.whale);
            option1.setText("dolphin");
            option2.setText("whale");
            option3.setText("giraffe");
            answer="whale";
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(answer==option2.getText()){
                        goodJobToast();

                        pic.setImageResource(R.drawable.sheep);
                        option1.setText("elephant");
                        option2.setText("zebra");
                        option3.setText("sheep");
                        answer="sheep";
                        option3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(answer==option3.getText()){
                                    wonderfulToast();

                                    pic.setImageResource(R.drawable.giraffe);
                                    option1.setText("giraffe");
                                    option2.setText("fish");
                                    option3.setText("snake");
                                    answer="giraffe";
                                    option1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if(answer==option1.getText()){
                                                excellentToast();

                                                pic.setImageResource(R.drawable.snake);
                                                option1.setText("penguin");
                                                option2.setText("snake");
                                                option3.setText("gorilla");
                                                answer="snake";
                                                option2.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        if(answer==option2.getText()){
                                                            veryGoodToast();

                                                            pic.setImageResource(R.drawable.dolphin);
                                                            option1.setText("lion");
                                                            option2.setText("dolphin");
                                                            option3.setText("rabbit");
                                                            answer="dolphin";
                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    if(answer==option2.getText()){
                                                                        amazingToast();

                                                                        pic.setImageResource(R.drawable.koala);
                                                                        option1.setText("zebra");
                                                                        option2.setText("snake");
                                                                        option3.setText("koala");
                                                                        answer="koala";
                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                if(answer==option3.getText()){
                                                                                    goodJobToast();

                                                                                    pic.setImageResource(R.drawable.shark);
                                                                                    option1.setText("shark");
                                                                                    option2.setText("mouse");
                                                                                    option3.setText("bear");
                                                                                    answer="shark";
                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            if(answer==option1.getText()){
                                                                                                goodJobToast();

                                                                                                pic.setImageResource(R.drawable.mouse);
                                                                                                option1.setText("mouse");
                                                                                                option2.setText("rabbit");
                                                                                                option3.setText("elephant");
                                                                                                answer="mouse";
                                                                                                option1.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        if(answer==option1.getText()){
                                                                                                            greatToast();

                                                                                                            pic.setImageResource(R.drawable.pic_zebra);
                                                                                                            option1.setText("panda");
                                                                                                            option2.setText("zebra");
                                                                                                            option3.setText("koala");
                                                                                                            answer="zebra";
                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    if(answer==option2.getText()){
                                                                                                                        wonderfulToast();

                                                                                                                        pic.setImageResource(R.drawable.monkey);
                                                                                                                        option1.setText("whale");
                                                                                                                        option2.setText("sheep");
                                                                                                                        option3.setText("monkey");
                                                                                                                        answer="monkey";
                                                                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                if(answer==option3.getText()){
                                                                                                                                    excellentToast();

                                                                                                                                    pic.setImageResource(R.drawable.pic_elephant);
                                                                                                                                    option1.setText("penguin");
                                                                                                                                    option2.setText("shark");
                                                                                                                                    option3.setText("elephant");
                                                                                                                                    answer="elephant";
                                                                                                                                    option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        @Override
                                                                                                                                        public void onClick(View v) {
                                                                                                                                            if(answer==option3.getText()){
                                                                                                                                                goodJobToast();

                                                                                                                                                pic.setImageResource(R.drawable.lion);
                                                                                                                                                option1.setText("sheep");
                                                                                                                                                option2.setText("lion");
                                                                                                                                                option3.setText("mouse");
                                                                                                                                                answer="lion";
                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                    @Override
                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                        if(answer==option2.getText()){
                                                                                                                                                            amazingToast();

                                                                                                                                                            pic.setImageResource(R.drawable.rabbit);
                                                                                                                                                            option1.setText("fish");
                                                                                                                                                            option2.setText("monkey");
                                                                                                                                                            option3.setText("rabbit");
                                                                                                                                                            answer="rabbit";
                                                                                                                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                @Override
                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                    if(answer==option3.getText()){
                                                                                                                                                                        excellentToast();

                                                                                                                                                                        pic.setImageResource(R.drawable.bear);
                                                                                                                                                                        option1.setText("bear");
                                                                                                                                                                        option2.setText("frog");
                                                                                                                                                                        option3.setText("snake");
                                                                                                                                                                        answer="bear";
                                                                                                                                                                        option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                            @Override
                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                if(answer==option1.getText()){
                                                                                                                                                                                    wonderfulToast();

                                                                                                                                                                                    pic.setImageResource(R.drawable.horse);
                                                                                                                                                                                    option1.setText("horse");
                                                                                                                                                                                    option2.setText("gorilla");
                                                                                                                                                                                    option3.setText("whale");
                                                                                                                                                                                    answer="horse";
                                                                                                                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        @Override
                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                            if(answer==option1.getText()){
                                                                                                                                                                                                amazingToast();

                                                                                                                                                                                                pic.setImageResource(R.drawable.penguin);
                                                                                                                                                                                                option1.setText("frog");
                                                                                                                                                                                                option2.setText("penguin");
                                                                                                                                                                                                option3.setText("bear");
                                                                                                                                                                                                answer="penguin";
                                                                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                    @Override
                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                        if(answer==option2.getText()){
                                                                                                                                                                                                            goodJobToast();

                                                                                                                                                                                                            pic.setImageResource(R.drawable.fish);
                                                                                                                                                                                                            option1.setText("koala");
                                                                                                                                                                                                            option2.setText("dolphin");
                                                                                                                                                                                                            option3.setText("fish");
                                                                                                                                                                                                            answer="fish";
                                                                                                                                                                                                            option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                @Override
                                                                                                                                                                                                                public void onClick(View v) {
                                                                                                                                                                                                                    if(answer==option3.getText()){
                                                                                                                                                                                                                        excellentToast();

                                                                                                                                                                                                                        pic.setImageResource(R.drawable.gorilla);
                                                                                                                                                                                                                        option1.setText("rabbit");
                                                                                                                                                                                                                        option2.setText("mouse");
                                                                                                                                                                                                                        option3.setText("gorilla");
                                                                                                                                                                                                                        answer="gorilla";
                                                                                                                                                                                                                        option3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                if(answer==option3.getText()){
                                                                                                                                                                                                                                    veryGoodToast();

                                                                                                                                                                                                                                    pic.setImageResource(R.drawable.frog);
                                                                                                                                                                                                                                    option1.setText("frog");
                                                                                                                                                                                                                                    option2.setText("lion");
                                                                                                                                                                                                                                    option3.setText("panda");
                                                                                                                                                                                                                                    answer="frog";
                                                                                                                                                                                                                                    option1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                                        public void onClick(View v) {
                                                                                                                                                                                                                                            if(answer==option1.getText()){
                                                                                                                                                                                                                                                amazingToast();

                                                                                                                                                                                                                                                pic.setImageResource(R.drawable.panda);
                                                                                                                                                                                                                                                option1.setText("horse");
                                                                                                                                                                                                                                                option2.setText("panda");
                                                                                                                                                                                                                                                option3.setText("shark");
                                                                                                                                                                                                                                                answer="panda";
                                                                                                                                                                                                                                                option2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                        if(answer==option2.getText()){
                                                                                                                                                                                                                                                            wonderfulToast();

                                                                                                                                                                                                                                                            pic.setImageResource(R.drawable.congratulations);
                                                                                                                                                                                                                                                            option1.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                            option3.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                            title.setText("");
                                                                                                                                                                                                                                                            option2.setText("Go back");
                                                                                                                                                                                                                                                            option2.setOnClickListener(new View.OnClickListener() {
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
        Toast.makeText(Match.this,"Great",Toast.LENGTH_SHORT).show();
    }
    public void goodJobToast(){
        Toast.makeText(Match.this,"Good job!",Toast.LENGTH_SHORT).show();
    }
    public void excellentToast(){
        Toast.makeText(Match.this,"Excellent!",Toast.LENGTH_SHORT).show();
    }
    public void veryGoodToast(){
        Toast.makeText(Match.this,"Very good!",Toast.LENGTH_SHORT).show();
    }
    public void wonderfulToast(){
        Toast.makeText(Match.this,"Wonderful!",Toast.LENGTH_SHORT).show();
    }
    public void amazingToast(){
        Toast.makeText(Match.this,"Amazing!",Toast.LENGTH_SHORT).show();
    }
    public void openActivityPlay(){
        Intent intent1= new Intent(this, Play.class);
        startActivity(intent1);
    }
}