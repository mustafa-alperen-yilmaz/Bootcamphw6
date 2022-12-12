package com.example.hw6.categoryfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw6.R;
import com.example.hw6.databinding.FragmentPlatformGameBinding;


public class PlatformGameFragment extends Fragment {
    private FragmentPlatformGameBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPlatformGameBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}