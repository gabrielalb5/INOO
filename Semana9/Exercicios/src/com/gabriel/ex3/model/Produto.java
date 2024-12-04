package com.gabriel.ex3.model;

public class Produto {
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
