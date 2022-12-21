package com.example.hw6;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.hw6.adapter.GameAdapter;
import com.example.hw6.adapter.MenuItemAdapter;
import com.example.hw6.databinding.BottomNavBinding;
import com.example.hw6.databinding.FragmentMainPageBinding;

import java.util.ArrayList;

public class MainPageFragment extends Fragment {
    private FragmentMainPageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainPageBinding.inflate(inflater, container, false);
        binding.recView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        ArrayList<Games> gamesArrayList = new ArrayList<>();
        Games game1 = new Games("FIFA 23",699,R.drawable.fifa);
        Games game2 = new Games("WARZONE",1199,R.drawable.warzone);
        Games game3 = new Games("WARBAND",150,R.drawable.warband);
        gamesArrayList.add(game1);
        gamesArrayList.add(game2);
        gamesArrayList.add(game3);
        GameAdapter adapter = new GameAdapter(requireContext(),gamesArrayList);
        binding.recView.setAdapter(adapter);

        binding.recView2.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        ArrayList<Menus> menusArrayList = new ArrayList<>();
        Menus menu1 = new Menus("Bağımsız",R.drawable.ic_baseline_lightbulb_24);
        Menus menu2 = new Menus("Klasikler",R.drawable.ic_baseline_videogame_asset_24);
        Menus menu3 = new Menus("Spor",R.drawable.ic_baseline_sports_football_24);
        Menus menu4 = new Menus("Platform",R.drawable.ic_baseline_filter_drama_24);
        Menus menu5 = new Menus("Aile",R.drawable.ic_baseline_family_restroom_24);
        Menus menu6 = new Menus("Nişancı",R.drawable.ic_baseline_expand_circle_down_24);
        Menus menu7 = new Menus("Macera",R.drawable.ic_baseline_kayaking_24);
        Menus menu8 = new Menus("Dövüş",R.drawable.ic_baseline_sign_language_24);
        menusArrayList.add(menu1);
        menusArrayList.add(menu2);
        menusArrayList.add(menu3);
        menusArrayList.add(menu4);
        menusArrayList.add(menu5);
        menusArrayList.add(menu6);
        menusArrayList.add(menu7);
        menusArrayList.add(menu8);
        MenuItemAdapter adapter1 = new MenuItemAdapter(requireContext(),menusArrayList);
        binding.recView2.setAdapter(adapter1);
        return binding.getRoot();
    }
}