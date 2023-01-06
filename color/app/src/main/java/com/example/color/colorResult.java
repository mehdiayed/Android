package com.example.color;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class colorResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_result);

    TextView t =findViewById(R.id.txt);
    Intent j=getIntent();
    String c = j.getStringExtra("c");
        if(c.equals("Y")){
        //color = Color.YELLOW;
        t.setBackgroundColor(Color.YELLOW);
    }
        if(c.equals("B")){
        //color = Color.BLUE;
        t.setBackgroundColor(Color.BLUE);
    }
        if(c.equals("R")){

        t.setBackgroundColor(Color.RED);
    }
        if (c.equals("G")) {
        //color = Color.GREEN;
        t.setBackgroundColor(Color.GREEN);
    }




}
    public void Retour (View v){
       {
          Intent k =new Intent(getApplicationContext(),MainActivity.class);
           startActivity(k);

        }}}