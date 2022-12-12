package com.example.hw6.categoryfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw6.R;
import com.example.hw6.databinding.FragmentFightGameBinding;


public class FightGameFragment extends Fragment {
    private FragmentFightGameBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFightGameBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}