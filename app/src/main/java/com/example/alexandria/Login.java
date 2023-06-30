package com.example.alexandria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class Login extends AppCompatActivity {

    EditText loginEmail, loginSenha;
    Button btnEntrar, voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmail = findViewById(R.id.txtLoginEmail);
        loginSenha = findViewById(R.id.txtLoginSenha);
        btnEntrar = findViewById(R.id.btnLoginEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validarEmail() | !validarSenha()){
                    validarSenha();
                    verificaUser();
                } else {
                    verificaUser();
                }
            }
        });

        voltar = findViewById(R.id.btnvoltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login.this, Bem_Vindo.class);
                startActivity(it);
            }
        });
    }

    public Boolean validarEmail(){
        String val = loginEmail.getText().toString();
        if(val.isEmpty()){
            loginEmail.setError("Informe o email");
            return false;
        } else {
            loginEmail.setError(null);
            return false;
        }
    }

    public Boolean validarSenha(){
        String val = loginSenha.getText().toString();
        if(val.isEmpty()){
            loginSenha.setError("Informe a senha");
            return false;
        } else {
            loginSenha.setError(null);
            return false;
        }
    }

    public void verificaUser(){
        String usuarioEmail = loginEmail.getText().toString().trim();
        String usuarioSenha = loginSenha.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("usuarios");
        Query verificaUserDataBase = reference.orderByChild("nome").equalTo(usuarioEmail);

        Intent it = new Intent(Login.this, MainActivity.class);
        startActivity(it);


    }
}