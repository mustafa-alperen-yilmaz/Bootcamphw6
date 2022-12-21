package com.example.hw6.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw6.Games;
import com.example.hw6.databinding.GameItemBinding;

import java.util.ArrayList;
import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameHolder> {
    private Context mContext;
    private List<Games> gamesList;

    public GameAdapter(Context mContext, List<Games> gamesList) {
        this.mContext = mContext;
        this.gamesList = gamesList;
    }
    public static class GameHolder extends RecyclerView.ViewHolder {
        private final GameItemBinding binding;
        public GameHolder(GameItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public GameAdapter.GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        GameItemBinding binding = GameItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new GameHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.GameHolder holder, int position) {

        Games game = gamesList.get(position);
        String prc = String.valueOf(game.getPrice());
        GameItemBinding bndg = holder.binding;
        bndg.nameText.setText(game.getGameName());
        bndg.priceText.setText(prc +"₺");
        bndg.imageView3.setImageResource(game.getImage());



    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }


}
