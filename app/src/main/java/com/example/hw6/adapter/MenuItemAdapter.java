package com.example.hw6.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw6.Games;
import com.example.hw6.Menus;
import com.example.hw6.databinding.GameItemBinding;
import com.example.hw6.databinding.MenuItemBinding;

import java.util.List;

public class MenuItemAdapter extends RecyclerView.Adapter<MenuItemAdapter.MenuHolder>{
    private Context mContext;
    private List<Menus> menusList;

    public MenuItemAdapter(Context mContext, List<Menus> menusList) {
        this.mContext = mContext;
        this.menusList = menusList;
    }

    public class MenuHolder extends RecyclerView.ViewHolder {
        private MenuItemBinding binding;
        public MenuHolder(MenuItemBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
    @NonNull
    @Override
    public MenuItemAdapter.MenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MenuItemBinding binding = MenuItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new MenuItemAdapter.MenuHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemAdapter.MenuHolder holder, int position) {
        Menus menu = menusList.get(position);
        MenuItemBinding bndg = holder.binding;
        bndg.textView.setText(menu.getMenuName());
        bndg.imageView4.setImageResource(menu.getImg());
    }

    @Override
    public int getItemCount() {
        return menusList.size();
    }


}
