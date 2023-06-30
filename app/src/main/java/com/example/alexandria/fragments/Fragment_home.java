package com.example.alexandria.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TableLayout;

import com.example.alexandria.R;
import com.example.alexandria.adapter.ViewPagerAdapter;
import com.example.alexandria.databinding.ActivityMainBinding;
import com.example.alexandria.databinding.FragmentHomeBinding;
import com.example.alexandria.home_fragments.Fragment_Divulgacao;
import com.example.alexandria.home_fragments.Fragment_Event;
import com.example.alexandria.home_fragments.Fragment_Livros;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Fragment_home extends Fragment {
    private ViewPager2 mViewPager;

    public Fragment_home() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mViewPager = view.findViewById(R.id.view_pager);
        mViewPager.setAdapter(new ViewPagerAdapter(getActivity()));

        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, mViewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(((ViewPagerAdapter)(mViewPager.getAdapter())).mFragmentNames[position]);
                    }
                }
        ).attach();
        return view;
    }
}