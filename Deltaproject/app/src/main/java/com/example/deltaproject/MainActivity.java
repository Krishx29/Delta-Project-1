package com.example.deltaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    int highScore,new_highScore;

    private static final String FILE_NAME = "highscore.txt";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gamebtn = findViewById(R.id.gamebtn);
        EditText editword = findViewById(R.id.editword);
        EditText editclue = findViewById(R.id.editclue);
        String word = editword.getText().toString();
        String clue = editclue.getText().toString();

        gamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = editword.getText().toString();
                String clue = editclue.getText().toString();
                if (word.length() > 0 && clue.length() > 0){
                    Bundle bundle = new Bundle();
                    bundle.putString("str1",editword.toString());
                    bundle.putString("str2",editclue.toString());
                    Intent i = new Intent(MainActivity.this, normalmode.class);
                    i.putExtra("str1",editword.getText().toString());
                    i.putExtra("str2",editclue.getText().toString());
                    startActivity(i);
                    overridePendingTransition(R.transition.slideinright,R.transition.slideinleft);
                }

                else {
                    Toast.makeText(MainActivity.this, "Please enter word and clue", Toast.LENGTH_SHORT).show();
            }
                }

            });

        Intent intent = getIntent();
        highScore = intent.getIntExtra("BestScore",0);

        if (highScore>new_highScore) {
            new_highScore =highScore;
            TextView highest = findViewById(R.id.highest);
            highest.setText("Best Score : " + new_highScore);
            save(highest);
        }
        load();


        }
    public void save(View v) {

        String string;
        TextView highest = findViewById(R.id.highest);
        string = highest.getText().toString();
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fileOutputStream.write(string.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void load(){
        FileInputStream fileInputStream = null;
        TextView highest = findViewById(R.id.highest);

        try {
            fileInputStream = openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder = new StringBuilder();
            String text;

            while((text = bufferedReader.readLine()) != null ){
                stringBuilder.append(text).append("\n");
            }

            highest.setText(stringBuilder.toString());

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try{
                    fileInputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }








    }













