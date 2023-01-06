package com.example.tp2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText a;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.txt);
        b1 = findViewById(R.id.btt1);
        b2 = findViewById(R.id.btt2);
        b3 = findViewById(R.id.btt3);
        b4 = findViewById(R.id.btt4);

    }

    /*Toast.makeText(getApplicationContext(),"Helllllllllo",Toast.LENGTH_SHORT).show();*/

    public void red(View v) {

            int c = getResources().getColor(R.color.red);
            a.setBackgroundColor(c);

    }
    public void yellow(View v) {

        int c = getResources().getColor(R.color.yellow);
        a.setBackgroundColor(c);

    }
    public void green(View v) {

        int c = getResources().getColor(R.color.green);
        a.setBackgroundColor(c);

    }
    public void blue(View v) {

        int c = getResources().getColor(R.color.blue);
        a.setBackgroundColor(c);

    }
}