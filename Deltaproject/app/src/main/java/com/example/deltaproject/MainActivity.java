package com.example.deltaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
        }
    }













