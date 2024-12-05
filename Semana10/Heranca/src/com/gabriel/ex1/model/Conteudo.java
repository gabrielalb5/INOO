package com.gabriel.ex1.model;

public class Conteudo {
    private String titulo;
    private int duracao;

    public Conteudo(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void exibirInfo(){
        System.out.println(getTitulo()+" ("+getDuracao()+" min)");
    }
}
