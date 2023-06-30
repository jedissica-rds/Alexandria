package com.example.alexandria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.alexandria.databinding.ActivityMainBinding;
import com.example.alexandria.fragments.Fragment_home;
import com.example.alexandria.home_fragments.Fragment_Divulgacao;
import com.example.alexandria.home_fragments.Fragment_Event;
import com.example.alexandria.home_fragments.Fragment_Livros;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private NavHostFragment navHostFragment;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initNavigation();

    }

    private void initNavigation() {
        navHostFragment
                = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);

    }

    }
