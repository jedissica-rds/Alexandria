package com.example.programacao_dispositivos_moveis.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.programacao_dispositivos_moveis.CustomAdapter;
import com.example.programacao_dispositivos_moveis.R;

public class Livros_Fragment extends Fragment {

    GridView gv;
String[] titulos = {"O Cortiço", "O Cancioneiro", "O Alienista", "Tarde", "As mensagens das violetas", "Dom Casmurro", "A Volta ao Mundo em 80 dias", "A Divina Comédia", "A Metamorfose", "Os Maias", "Mensagens", "As Primaveras" };
    int[] capas = {R.drawable.img_1,R.drawable.img_2,R.drawable.img,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,R.drawable.img_9,R.drawable.img_10,R.drawable.img_11};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_livros_, null);

        gv= rootView.findViewById(R.id.grid_view);

        CustomAdapter adapter = new CustomAdapter(getActivity(), titulos, capas );
        gv.setAdapter(adapter);

        return rootView;
    }
}