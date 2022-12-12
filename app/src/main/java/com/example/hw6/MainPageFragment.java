package com.example.hw6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw6.databinding.FragmentMainPageBinding;

public class MainPageFragment extends Fragment {
    private FragmentMainPageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainPageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}