package com.gabriel.ex3.model;

public class Produto {
    private String descricao;
    private double produto;

    public Produto(String descricao, double produto){
        this.descricao = descricao;
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getProduto() {
        return produto;
    }
}
