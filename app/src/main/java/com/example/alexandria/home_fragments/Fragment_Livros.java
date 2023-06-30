package com.example.alexandria.home_fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.alexandria.PerfilLivro;
import com.example.alexandria.R;
import com.example.alexandria.adapter.CustomAdapter;

public class Fragment_Livros extends Fragment {
    GridView gv;
    String[] titulos = {"A mensagem", "A Metamorfose", "O Alienista", "Dom Casmurro", "O Cortiço", "A Divina Comédia"};

    String[] autores = {"Fernando Pessoa", "Franz Kafka", "Machado de Assis", "Machado de Assis", "Aluísio Azevedo", "A Divina Comédia"};
    int[] capas = {R.drawable.imagem_teste, R.drawable.imagem_teste2, R.drawable.imagem_teste3, R.drawable.imagem_teste4, R.drawable.imagem_teste5, R.drawable.imagem_teste6};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment__livros, null);

        gv= rootView.findViewById(R.id.grid_view);

        CustomAdapter adapter = new CustomAdapter(getActivity(), titulos, capas, autores);
        gv.setAdapter(adapter);

        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), PerfilLivro.class);
                intent.putExtra("titulo", titulos[position]);
                intent.putExtra("capa", capas[position]);
                intent.putExtra("autor", capas[position]);
                startActivity(intent);
            }
        });

        return rootView;
    }
}