package com.example.recycleview_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Android_Version> AndroidList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Recyclerview holder
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        //scrolling manager
        LinearLayoutManager LM = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(LM);
        //data source Creation
        Android_Version av = new Android_Version("Orio",1,2019, R.drawable.orio_pic);
        AndroidList.add(av);
         av = new Android_Version("Nougat",2,2018, R.drawable.nougat_pic);
        AndroidList.add(av);
         av = new Android_Version("Marshmellow",3,2017, R.drawable.marshmello_pic);
        AndroidList.add(av);
        av = new Android_Version("Orio",1,2019, R.drawable.orio_pic);
        AndroidList.add(av);
        av = new Android_Version("Orio",1,2019, R.drawable.orio_pic);
        AndroidList.add(av);
        av = new Android_Version("Nougat",2,2018, R.drawable.nougat_pic);
        AndroidList.add(av);
        av = new Android_Version("Marshmellow",3,2017, R.drawable.marshmello_pic);
        AndroidList.add(av);

        //call Adapter
        myAdapter = new Adapter(AndroidList);
        recyclerView.setAdapter(myAdapter);
    }
}