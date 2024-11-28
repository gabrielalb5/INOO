package com.gabriel.ex2.model;

public class Musica {
    private String nome;
    private String genero;
    private String cantor;
    private String tempo;

    public Musica( String nome, String genero, String cantor, String tempo){
        this.nome = nome;
        this.genero = genero;
        this.cantor = cantor;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getCantor() {
        return cantor;
    }

    public String getTempo() {
        return tempo;
    }
}
