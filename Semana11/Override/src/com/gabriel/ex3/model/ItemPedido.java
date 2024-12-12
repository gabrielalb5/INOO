package com.gabriel.ex3.model;

public class ItemPedido {
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nomeProduto, int quantidade, double precoUnitario){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario= precoUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
