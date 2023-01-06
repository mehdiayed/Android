package com.example.exercice1td1android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText chaine;
    Button btn1,btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chaine = findViewById(R.id.chaine);
        btn1  = findViewById(R.id.btn1);
        btn2  = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String ch="";
                String taille = chaine.getText().toString();
                int J= Integer.valueOf(taille);
                for(int i=0;i<=J;i++) {
                    Random rand = new Random();
                    char c = (char) (rand.nextInt(26) + 97);
                    ch+=c;
                }
                Intent x=new Intent(getApplicationContext(),result.class);
                x.putExtra("a",ch);
                startActivity(x);
            }
        });

    }

}