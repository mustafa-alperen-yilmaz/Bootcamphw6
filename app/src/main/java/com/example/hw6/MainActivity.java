package com.example.hw6;

import static androidx.navigation.Navigation.findNavController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.hw6.databinding.ActivityMainBinding;
import com.example.hw6.databinding.BottomNavBinding;

public class MainActivity extends AppCompatActivity {
    private BottomNavBinding binding;
   // private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = BottomNavBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView3);
        NavigationUI.setupWithNavController(binding.bottomNav , navHostFragment.getNavController());
    }
}