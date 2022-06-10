package com.example.homework32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeroesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvHeroes;

    public HeroesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvHeroes = itemView.findViewById(R.id.heroes);
    }

    public void bind(String heroes) {
        tvHeroes.setText(heroes);
    }
}

