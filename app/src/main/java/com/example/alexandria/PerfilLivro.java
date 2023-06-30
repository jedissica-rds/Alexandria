package com.example.alexandria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PerfilLivro extends AppCompatActivity {

    TextView titulo, autor;
    ImageView capa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_livro);

        titulo = findViewById(R.id.tituloPerfil);
        capa = findViewById(R.id.capaPerfil);
        autor = findViewById(R.id.txtviewAutorLivro);

        Intent intent =  getIntent();
        titulo.setText(intent.getStringExtra("titulo"));
        autor.setText(intent.getStringExtra("autor"));
        capa.setImageResource(intent.getIntExtra("capa", 0));



    }
}