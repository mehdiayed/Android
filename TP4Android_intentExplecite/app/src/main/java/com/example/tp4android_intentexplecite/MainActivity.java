package com.example.tp4android_intentexplecite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText entiera,entierb;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn1);
        entiera=findViewById(R.id.edit1);
        entierb=findViewById(R.id.edit2);
        res=findViewById(R.id.text1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("a",entiera.getText().toString());
                i.putExtra("b", entierb.getText().toString());
                startActivityForResult(i,22);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==22)
        {
            if(resultCode==RESULT_OK)
            {
                Integer a=data.getIntExtra("resultat_a_envoyer", 0);
                res.setText("res = "+ a);
            }
            else
            {
                res.setText("Opération annulée");
            }
        } }
}