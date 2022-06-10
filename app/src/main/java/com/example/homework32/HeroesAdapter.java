package com.example.homework32;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesViewHolder> {
    private ArrayList<String> heroes;

    public HeroesAdapter(ArrayList<String> heroes) {
        this.heroes = heroes;
    }


    @NonNull
    @Override
    public HeroesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeroesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_heroes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeroesViewHolder holder, int position) {
        holder.bind(heroes.get(position));
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }
}

