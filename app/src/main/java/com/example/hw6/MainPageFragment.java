package com.example.hw6;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

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
        binding.recView.setLayoutManager(new LinearLayoutManager(requireContext()));
        ArrayList<Games> gamesArrayList = new ArrayList<>();
        Games game1 = new Games("warband",50);
        Games game2 = new Games("warband",50);
        Games game3 = new Games("warband",50);
        gamesArrayList.add(game1);
        gamesArrayList.add(game2);
        gamesArrayList.add(game3);

        return binding.getRoot();
    }
}