package com.example.tp3android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText a,b;
    RadioButton b1,b2,b3,b4;
    Button btn;
    TextView resultat;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.edit1);
        b=findViewById(R.id.edit2);
        b1=findViewById(R.id.btt1);
        b2=findViewById(R.id.btt2);
        b3=findViewById(R.id.btt3);
        b4=findViewById(R.id.btt4);
        btn=findViewById(R.id.btnn);
        resultat=findViewById(R.id.res);


    }



    public void Calculer(View v){
        /*Toast.makeText(getApplicationContext(),"Helllllllllo",Toast.LENGTH_SHORT).show();*/
        if(b1.isChecked()){
            String var1 = a.getText().toString();
            String var2 = b.getText().toString();
            Integer s=Integer.valueOf(var1)+Integer.valueOf(var2);
            resultat.setText(""+s);
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("resultat", resultat.getText().toString());

            startActivity(i);

        }
        else if (b2.isChecked())
        {
            String var1 = a.getText().toString();
            String var2 = b.getText().toString();
            Integer s=Integer.valueOf(var1)*Integer.valueOf(var2);
            resultat.setText(""+s);
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("resultat", resultat.getText().toString());

            startActivity(i);
        }
        else if (b3.isChecked())
        {
            String var1 = a.getText().toString();
            String var2 = b.getText().toString();
            Integer s=Integer.valueOf(var1)-Integer.valueOf(var2);
            resultat.setText(""+s);
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("resultat", resultat.getText().toString());

            startActivity(i);
        }
        else if (b4.isChecked()){
            String var1 = a.getText().toString();
            String var2 = b.getText().toString();
            Integer s=Integer.valueOf(var1)/Integer.valueOf(var2);
           resultat.setText(""+s);
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("resultat", resultat.getText().toString());

            startActivity(i);
        }

    }


}