package com.example.programacao_dispositivos_moveis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

   public Context c;
   public  String[] titulos;
   public int[] capas;


   public CustomAdapter(Context c, String[] titulos, int[] capas) {
       this.c = c;
       this.titulos = titulos;
       this.capas = capas;
   }


    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return titulos[position];
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

            titulo.setText(titulos[position]);
            capa.setImageResource(capas[position]);

            return convertView;
    }
}
