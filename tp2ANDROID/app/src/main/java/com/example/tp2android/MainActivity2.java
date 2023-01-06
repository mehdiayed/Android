package com.example.tp2android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t;
    EditText e;
    Button bttt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t=findViewById(R.id.txtes);
        e=findViewById(R.id.champs);
        bttt=findViewById(R.id.cc);

    }


    public void bold(View v) {
        t.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

    }
    public void italicc(View v) {
        t.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));

    }
    public void vis(View v) {
        bttt.setVisibility(View.VISIBLE);
        e.setVisibility(View.VISIBLE);
    }

    public void change(View v){
        String var1 = e.getText().toString();
        Float s=Float.valueOf(var1);
        t.setTextSize(s);
    }

}