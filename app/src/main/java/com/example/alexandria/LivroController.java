package com.example.alexandria;

import com.example.alexandria.control.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroController {

    private int proxCodigo;
    private final List<Livro> livros;

    private static LivroController instancia = null;

    private LivroController(){
        livros = new ArrayList<>();
        proxCodigo = 1;
    }

    public int getProxCodigo(){
        return proxCodigo;
    }

    public static LivroController getInstancia(){
        if (instancia == null)
            instancia = new LivroController();
        return instancia;
    }

    public void cadastrar(Livro livro){
        livro.setCodigo(proxCodigo);
        boolean resultado = livros.add(livro);
        if (resultado)
            proxCodigo += 1;

    }

    public boolean alterar(Livro livro){
        for (int i = 0; i < livros.size(); i++) {
            if (livro.getCodigo()==livros.get(i).getCodigo()){
                livros.set(i, livro);
                return true;
            }
        }
        return false;
    }

    public int remover(Livro livro){
        int cont = 0;
        for (int i = 0; i < livros.size(); i++) {
            if (livro.getCodigo()==livros.get(i).getCodigo()){
                livros.remove(i);
                cont += 1;
            }
        }
        return cont;
    }

    public List<Livro> buscarTodos(){
        return new ArrayList<>(livros);
    }

    public Livro buscarPorPosicao(int posicao){
        return livros.get(posicao);
    }

    public Livro buscarPorcodigo(int codigo){

        for (Livro funcionario : livros){
            if (funcionario.getCodigo()==codigo)
                return funcionario;
        }
        return null;
    }


}
