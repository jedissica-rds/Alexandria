package com.example.alexandria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Cadastro extends AppCompatActivity {

    //Declaração variáveis pra chamar da activity depois e variaveis do banco
    EditText cadastroNome, cadastroEmail, cadastroSenha;
    Button btnCadastrar;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        cadastroNome = findViewById(R.id.txtCadastroNome);
        cadastroEmail = findViewById(R.id.editCad);
        cadastroSenha = findViewById(R.id.txtCadastroSenha);
        btnCadastrar = findViewById(R.id.btnCadastrarUser);

        //ação do botão de cadastrar
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Passando pro Banco
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("usuarios");

                String nome = cadastroNome.getText().toString();
                String email = cadastroEmail.getText().toString();
                String senha = cadastroSenha.getText().toString();


                User usuario = new User(nome, email, senha);
                reference.child("usuarios").child(nome).setValue(new User(nome, email, senha));

                Toast.makeText(Cadastro.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(Cadastro.this, Login.class);
                startActivity(it);

            }
        });

        Button voltar = findViewById(R.id.btnvoltar2);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Cadastro.this, Bem_Vindo.class);
                startActivity(it);
            }
        });
    }
}