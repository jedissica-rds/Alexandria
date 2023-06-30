package com.example.alexandria.control;

import android.graphics.Bitmap;

import java.util.Objects;

public class Livro {
    public int codigo;
    public String titulo;
    public String autor;
    public String sinopse;

    public Bitmap capa;

    public Livro() {
    }

    public Livro(int codigo, String titulo, String autor, String sinopse, Bitmap capa) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.capa = capa;
    }

    public Bitmap getCapa() {
        return capa;
    }

    public void setCapa(Bitmap capa) {
        this.capa = capa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro that = (Livro) o;
        return codigo == that.codigo;
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }

}
