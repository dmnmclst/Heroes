package com.example.homework32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_heroes);
        HeroesAdapter adapter = new HeroesAdapter(heroes);
        recyclerView.setAdapter(adapter);

    }

    private void loadData(){
        heroes = new ArrayList<>();
        heroes.add("Warrior");
        heroes.add("Medic");
        heroes.add("Itachi");
        heroes.add("Naruto");
        heroes.add("Midoriya");
        heroes.add("Kirito");
        heroes.add("Asuna");
        heroes.add("Sniper");
        heroes.add("Ichigo");
        heroes.add("Hatiman");
        heroes.add("Bakugo");
        heroes.add("Saske");
        heroes.add("Hisoka");
        heroes.add("Killua");
    }
}