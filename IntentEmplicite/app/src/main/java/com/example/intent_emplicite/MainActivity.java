package com.example.intent_emplicite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5;
    EditText edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        edit1=findViewById(R.id.edit1);
        int permissionCheck = ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override

        public void onClick (View view) {
            String n = edit1.getText().toString();
            Intent appel = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + n));
            startActivity(appel);
        }});
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact =
                        new Intent(Intent.ACTION_PICK,
                                Uri.parse("content://contacts/people/"));
                startActivity(contact);


            }});
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web=
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http:www.google.fr"));
                startActivity(web);
            } });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appmanager=
                        new  Intent(Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS);
                startActivity(appmanager);
            } });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            Intent wi = new Intent(Settings.ACTION_WIFI_SETTINGS);
            startActivity(wi);
        }});
        }}
