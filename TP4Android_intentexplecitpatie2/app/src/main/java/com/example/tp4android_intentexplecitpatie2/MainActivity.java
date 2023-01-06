package com.example.tp4android_intentexplecitpatie2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button Button_call,Button_PhoneDial,Button_ows,Button_AM,Button_wifi;
    EditText chaine1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button_call=findViewById(R.id.btn_call);
        Button_PhoneDial=findViewById(R.id.btn_PhoneDial);
        Button_ows=findViewById(R.id.btn_ows);
        Button_AM=findViewById(R.id.btn_AM);
        Button_wifi=findViewById(R.id.btn_wifi);
        chaine1=findViewById(R.id.chaine);

        // wifi button

        Button_wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wifi = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(wifi);
            }
        });


        // Application Manager button
        Button_AM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AM = new Intent(Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS);
                startActivity(AM);
            }
        });

        // open web site button
        Button_ows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(chaine1.getText().toString()));
                startActivity(web);
            }
        });
    }

}