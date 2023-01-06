package com.example.tp3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView resultat2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        resultat2=findViewById(R.id.res2);
        Intent j=getIntent();
        String n=j.getStringExtra("resultat");

        resultat2.setText(" " + n);
    }




}