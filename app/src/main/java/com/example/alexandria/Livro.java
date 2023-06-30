package com.example.alexandria;

public class Livro {
    String titulo, sinopse, autor;
    int codigo;

    public Livro() {
    }

    public Livro(String titulo, String sinopse, String autor) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

