package com.example.tp2android_with_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button r,v,j,b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = (Button) findViewById(R.id.rouge);
        v = findViewById(R.id.vert);
        j = findViewById(R.id.jaune);
        b = findViewById(R.id.bleu);
        t = findViewById(R.id.change);

    }
    public void rFunction(View view){
        Intent i =new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("c","R");
        startActivity(i);

    }

    public void bFunction(View view){
        int bleu= Color.BLUE;
        Intent i =new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("c","B");
        startActivity(i);
    }


    public void jFunction(View view){
        int jaune= Color.YELLOW;
        Intent i =new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("c","Y");
        startActivity(i);
    }

    public void vFunction(View view){
        int vert= Color.GREEN;
        Intent i =new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("c","G");
        startActivity(i);
    }
}