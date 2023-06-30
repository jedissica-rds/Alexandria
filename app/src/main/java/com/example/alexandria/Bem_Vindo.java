package com.example.alexandria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bem_Vindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);


        Button login = findViewById(R.id.btn_entrar);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Bem_Vindo.this, Login.class);
                startActivity(it);

            }
        });

        Button cadastro = findViewById(R.id.btn_cadastro);
        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Bem_Vindo.this, Cadastro.class);
                startActivity(it);

            }
        });

    }
}