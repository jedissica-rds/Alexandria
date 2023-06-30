package com.example.alexandria.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.alexandria.home_fragments.Fragment_Divulgacao;
import com.example.alexandria.home_fragments.Fragment_Event;
import com.example.alexandria.home_fragments.Fragment_Livros;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private final Fragment[] mFragments = new Fragment[] {
            new Fragment_Livros(),
            new Fragment_Divulgacao(),
            new Fragment_Event(),
    };
    public final String[] mFragmentNames = new String[] {
            "Livros",
            "Divulgação",
            "Eventos"
    };

    public ViewPagerAdapter(FragmentActivity fa){
        super(fa);
    }

    @Override
    public int getItemCount() {
        return mFragments.length;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragments[position];
    }
}
