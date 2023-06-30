package com.example.alexandria.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alexandria.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    public Context c;
    public  String[] titulos;

    public String[] titles;

    public String[] autores;
    public int[] capas;


    public CustomAdapter(Context c, String[] titles, int[] capas, String[] autores) {
        this.c = c;
        this.titles = titles;
        this.capas = capas;
        this.autores = autores;
    }


    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return titles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item, null);
        }

        TextView titulo = convertView.findViewById(R.id.titulo);
        ImageView capa = convertView.findViewById(R.id.capa);
        TextView autor = convertView.findViewById(R.id.autor);

        titulo.setText(titles[position]);
        autor.setText(autores[position]);
        capa.setImageResource(capas[position]);

        return convertView;
    }
}
