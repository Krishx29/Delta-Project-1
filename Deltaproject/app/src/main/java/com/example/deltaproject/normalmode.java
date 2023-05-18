package com.example.deltaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class normalmode extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;;
    private String str1="",str22="";

    private int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16;
    private String textWord,textClue;
    private TextView guessbox,highscore;
    private ArrayList<Character> characters = new ArrayList<>();
    private int index,lives=3;
    private Button reset,check;
    private ImageView info,heart1,heart2,heart3;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        //Transferring strings from MainActivity
        Intent i = getIntent();
        textWord = i.getStringExtra("str1");
        textClue = i.getStringExtra("str2");

        array();

        Collections.shuffle(characters);

//        Assign
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        check = (Button) findViewById(R.id.check);
        reset = (Button) findViewById(R.id.reset);

        //Assigning values for other values
        info = findViewById(R.id.info);
        heart1 = findViewById(R.id.hrt1);
        heart2 = findViewById(R.id.hrt2);
        heart3 = findViewById(R.id.hrt3);
        guessbox = findViewById(R.id.guessbox);
        change();

        guessbox.setText(str1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b1);b1.setClickable(false);
            b1.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));
            i1++;}
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b2);b2.setClickable(false);
                b2.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));
            i2++;}
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b3);b3.setClickable(false);
                b3.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));
            i3++;}
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b4);b4.setClickable(false);
                b4.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));
            i4++;}
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b5);b5.setClickable(false);
                b5.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));
            i5++;}
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b6);b6.setClickable(false);
                b6.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i6++;}
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b7);b7.setClickable(false);
                b7.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i7++;}
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b8);b8.setClickable(false);
                b8.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i8++;}
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b9);b9.setClickable(false);
                b9.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i9++;}
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b10);b10.setClickable(false);
                b10.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i10++;}
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b11);b11.setClickable(false);
                b11.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i11++;}
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b12);b12.setClickable(false);
                b12.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i12++;}
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b13);b13.setClickable(false);
                b13.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i13++;}
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b14);b14.setClickable(false);
                b14.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i14++;}
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b15);b15.setClickable(false);
                b15.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i15++;}
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {clicked(b16);b16.setClickable(false);
                b16.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchange));i16++;}
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(normalmode.this, "Letters have been shuffled", Toast.LENGTH_SHORT).show();
                str1 = "";
                for (int a=0;a<textWord.length();a++){str1=str1+"_ ";}
                guessbox.setText(str1);
                change();
                btnundo();
                Unselect();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cluebox();
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score();
            }
        });
    }
    public void array() {
        int num = 0;

        while (num <textWord .length()) {
            characters.add(textWord.charAt(num));
            num++;
        }
        while (num < 16) {
            Random rand = new Random();
            char alpha = (char) (rand.nextInt(26) + 'a');
            characters.add(alpha);
            num++;
        }
    }




    private void score() {

        str22=str1;
        while(str22.contains(" ")){
            str22=str22.replace(" ","");
        }
        if(!(str1.contains("_"))) {
            str22=str1;
            while(str22.contains(" ")){
                str22=str22.replace(" ","");
            }
            if(!(str1.contains("_"))){
                if(str22.equals(textWord.toLowerCase())){
                    Toast.makeText(this, "Your Guess is correct", Toast.LENGTH_SHORT).show();
                    if(lives==3){
                        score=score+500;
                    }
                    else if(lives==2){
                        score+=300;
                    }
                    else{
                        score+=200;
                    }
                    scorebox(score);
                }
                else if(lives==3){
                    Collections.shuffle(characters);
                    change();
                    btnundo();
                    Unselect();
                    heart3.setImageResource(R.drawable.greyhearrt2);
                    Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                    lives-=1;
                }
                else if(lives==2){
                    Collections.shuffle(characters);
                    change();
                    btnundo();
                    Unselect();
                    Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                    heart2.setImageResource(R.drawable.greyhearrt2);
                    lives-=1;
                }
                else if(lives==1) {
                    Collections.shuffle(characters);
                    change();
                    btnundo();
                    Unselect();
                    Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                    heart1.setImageResource(R.drawable.greyhearrt2);
                    lives -= 1;
                    scorebox(score);
                }
            }else{
                Toast.makeText(this, "Enter the right number of characters", Toast.LENGTH_SHORT).show();
            }
        }

        }

    private void change() {
        b1.setText(characters.get(0).toString());
        b2.setText(characters.get(1).toString());
        b3.setText(characters.get(2).toString());
        b4.setText(characters.get(3).toString());
        b5.setText(characters.get(4).toString());
        b6.setText(characters.get(5).toString());
        b7.setText(characters.get(6).toString());
        b8.setText(characters.get(7).toString());
        b9.setText(characters.get(8).toString());
        b10.setText(characters.get(9).toString());
        b11.setText(characters.get(10).toString());
        b12.setText(characters.get(11).toString());
        b13.setText(characters.get(12).toString());
        b14.setText(characters.get(13).toString());
        b15.setText(characters.get(14).toString());
        b16.setText(characters.get(15).toString());
        str1 = "";
        for (int k=0;k<textWord.length();k++){
            str1 = str1 + "_ ";
            guessbox.setText(str1);
        }
        score = 0;
    }

    private void clicked(Button txt){
        if(str1.contains("_ ")){
            index = str1.indexOf('_');
            str1 = str1.substring(0,index) + txt.getText().toString() + str1.substring(index+1,str1.length());
            guessbox.setText(str1);
        }
        else{
            Toast.makeText(this, "MAX LENGTH", Toast.LENGTH_SHORT).show();
        }
    }

    public void scorebox(int score){
        final Dialog dialog = new Dialog(normalmode.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.score);
        TextView txt = dialog.findViewById(R.id.score);
        txt.setText("Your Score : "+Integer.toString(score));
        Button btn1 = dialog.findViewById(R.id.home);
        Button btn2 = dialog.findViewById(R.id.playagain);
        dialog.show();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(normalmode.this,MainActivity.class);
                intent.putExtra("BestScore",score);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(characters);
                change();
                btnundo();
                Unselect();
                dialog.dismiss();
                playAgain();
            }
        });

    }

    private void cluebox(){
        final Dialog dialog = new Dialog(normalmode.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialoguebox);
        TextView txt = dialog.findViewById(R.id.txt_input);
        Button btn = dialog.findViewById(R.id.btn_okay);
        txt.setText(textClue);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void Unselect(){
        b1.setClickable(true);
        i1=0;
        b2.setClickable(true);
        i2=0;
        b3.setClickable(true);
        i3=0;
        b4.setClickable(true);
        i4=0;
        b5.setClickable(true);i5=0;i6=0;i7=0;i8=0;i9=0;i10=0;i11=0;i12=0;i13=0;i14=0;i15=0;i16=0;
        b6.setClickable(true);
        b7.setClickable(true);
        b8.setClickable(true);
        b9.setClickable(true);
        b10.setClickable(true);
        b11.setClickable(true);
        b12.setClickable(true);
        b13.setClickable(true);
        b14.setClickable(true);
        b15.setClickable(true);
        b16.setClickable(true);
    }
    public void playagainbtn(){
        Button play_again;
        play_again = (Button) findViewById(R.id.playagain);
    }

    private void playAgain(){
        change();
        btnundo();
        Unselect();
        score = 0;
    }


    public void btnundo(){
        if (i1>0){b1.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i2>0){b2.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i3>0){b3.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i4>0){b4.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i5>0){b5.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i6>0){b6.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i7>0){b7.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i8>0){b8.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i9>0){b9.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i10>0){b10.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i11>0){b11.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i12>0){b12.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i13>0){b13.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i14>0){b14.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i15>0){b15.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}
        if (i16>0){b16.setBackgroundDrawable(getResources().getDrawable(R.drawable.btnchangeundo));}



    }


    }





