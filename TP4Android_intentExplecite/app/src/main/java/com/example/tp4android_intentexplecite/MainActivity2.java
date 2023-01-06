package com.example.tp4android_intentexplecite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnok, btnannuler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnok = findViewById(R.id.button2);
        btnannuler = findViewById(R.id.button3);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Receive data
                Intent j = getIntent();
                Integer a = Integer.valueOf(j.getStringExtra("a"));
                Integer b = Integer.valueOf(j.getStringExtra("b"));
                Integer r = a + b;
                //Send data
                Intent k = new Intent();
                k.putExtra("resultat_a_envoyer", r);
                Log.i("cha", "set result ok=");
                setResult(RESULT_OK, k);
                finish();
            }
        });
        btnannuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent();
                setResult(RESULT_CANCELED, k);
                finish();
            }
        });
    }}