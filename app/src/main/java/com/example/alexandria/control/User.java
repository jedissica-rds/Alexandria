package com.example.alexandria.control;

public class User {
    String email;
    String nome_completo;
    String senha;

    public String getSenha() {
        return senha;
    }

    public User(String email, String senha, String nome_completo) {
        this.senha = senha;
        this.nome_completo = nome_completo;
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
