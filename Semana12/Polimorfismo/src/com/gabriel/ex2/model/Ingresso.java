package com.gabriel.ex2.model;

public class Ingresso {
    private String nome;
    private double valor;

    public Ingresso(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void imprimeValor(){
        System.out.println(getNome()+" - R$"+getValor());
    }
}
