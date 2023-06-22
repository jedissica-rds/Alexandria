package com.example.programacao_dispositivos_moveis;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.programacao_dispositivos_moveis.fragments.Divulgacao_Fragment;
import com.example.programacao_dispositivos_moveis.fragments.EventosFragment;
import com.example.programacao_dispositivos_moveis.fragments.Livros_Fragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 0:
                return new Livros_Fragment();

            case 1:
                return new Divulgacao_Fragment();

            case 2:
                return new EventosFragment();

            default:
                return new Livros_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
