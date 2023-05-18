package com.example.deltaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Hackermode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackermode);

        Button normal,hacker;
        normal = findViewById(R.id.normalmode);
        hacker = findViewById(R.id.hackermode);
        Intent i = new Intent(Hackermode.this, MainActivity.class);
        startActivity(i);

    }
}