package com.gabriel.aulaAbstract.model;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String instituicao;

    public Pessoa(String nome, int idade, String instituicao){
        this.nome = nome;
        this.idade = idade;
        this.instituicao = instituicao;
    } 

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public abstract void minhaRenda();
    public abstract void apresentacao();
}
