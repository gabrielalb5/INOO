package com.gabriel.ex3.model;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
