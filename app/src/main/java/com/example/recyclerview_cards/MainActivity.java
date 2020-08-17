package com.example.recyclerview_cards;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[];
    int  images[]={R.drawable.tom,R.drawable.snoopy400x400,R.drawable.ayudante,R.drawable.dino,R.drawable.scoob,R.drawable.blinky};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.RecyclerView);
        s1= getResources().getStringArray(R.array.programing_languages);
        s2= getResources().getStringArray(R.array.description);

         MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
         recyclerView.setAdapter(myAdapter);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }



    public void Siguiente(View view){
        Intent sig = new Intent(this,SegundoAct.class);

        startActivity(sig);

    }
}