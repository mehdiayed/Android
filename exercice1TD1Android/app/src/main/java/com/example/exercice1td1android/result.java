package com.example.exercice1td1android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text=findViewById(R.id.et);
        Intent j=getIntent();
        String n=j.getStringExtra("a");
        text.setText(n);


    }
}