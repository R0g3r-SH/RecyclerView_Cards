package com.example.recyclerview_cards;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import java.util.Objects;

public class SegundoAct extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[];
    int  images[]={R.drawable.blinky,R.drawable.scoob,R.drawable.ayudante,R.drawable.dino,R.drawable.tom};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);




        recyclerView = findViewById(R.id.RecyclerView2);
        s1= getResources().getStringArray(R.array.programing_languages2);
        s2= getResources().getStringArray(R.array.description2);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }



    public void atras(View view){
        Intent back = new Intent(this,MainActivity.class);

        startActivity(back);

    }
}