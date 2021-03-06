package com.example.recuclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> mountains = Arrays.asList("Kinnekulle", "Billingen" , "K2", "Kebnekaise", "Hunneberg", "Halleberg", "Eriksberg", "Karlsberg");


        recyclerView = findViewById(R.id.recycler_view);
        MountainAdapter mountainAdapter = new MountainAdapter(mountains);
        recyclerView.setAdapter(mountainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}