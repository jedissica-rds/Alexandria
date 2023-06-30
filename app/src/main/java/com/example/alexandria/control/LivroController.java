package com.example.alexandria.control;

import java.util.ArrayList;
import java.util.List;

public class LivroController {

    private int proxCodigo;
    private final ArrayList<Livro> acervo;
    public static ArrayList<String> titulosLivro;

    public static List<String> getTitulosLivro() {
        return titulosLivro;
    }

    public void setTitulosLivro(ArrayList<String> titulosLivro) {
        this.titulosLivro = titulosLivro;
    }

    private final List<String> autorLivro;

    private static String[] arrayTitulo;
    private static String[] arrayAutor;


    public LivroController(){
        acervo = new ArrayList<>();
        titulosLivro = new ArrayList<>();
        autorLivro = new ArrayList<>();
        proxCodigo = 1;
    }

    public int getProxCodigo(){
        return proxCodigo;
    }
    public void cadastrar(Livro livro){
        livro.setCodigo(proxCodigo);
        boolean resultado = acervo.add(livro);
        if (resultado)
            proxCodigo += 1;

    }

    public void cadastrarTitulos(String livro){
        titulosLivro.add(livro);
    }

    public void cadastrarAutor(String livro){
        boolean resultado = autorLivro.add(livro);
        if (resultado)
            proxCodigo += 1;

    }

    public String[] titulosToArray() {
        arrayTitulo = (String[]) titulosLivro.toArray();
        return arrayTitulo;
    }

    public void autoresToArray(Livro livro) {
        arrayAutor = (String[]) autorLivro.toArray();
    }

    public boolean alterar(Livro funcionario){
        for (int i = 0; i < acervo.size(); i++) {
            if (funcionario.getCodigo()==acervo.get(i).getCodigo()){
                acervo.set(i, funcionario);
                return true;
            }
        }
        return false;
    }

    public int remover(Livro funcionario){
        int cont = 0;
        for (int i = 0; i < acervo.size(); i++) {
            if (funcionario.getCodigo()==acervo.get(i).getCodigo()){
                acervo.remove(i);
                cont += 1;
            }
        }
        return cont;
    }

    public List<Livro> buscarTodos(){
        return new ArrayList<>(acervo);
    }

    public List<String> buscarTodosTitulos(){
        return new ArrayList<>(titulosLivro);
    }

    public Livro buscarPorPosicao(int posicao){
        return acervo.get(posicao);
    }

    public Livro buscarPorcodigo(int codigo){

        for (Livro funcionario : acervo){
            if (funcionario.getCodigo()==codigo)
                return funcionario;
        }
        return null;
    }
}
