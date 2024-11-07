package com.gabriel.ex2.model;

public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;
    
    public Cliente(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirEndereco(){
        if(endereco.getComplemento()!="")
            System.out.println(endereco.getLogradouro()+", "+endereco.getNumero()+" - "+endereco.getCidade()+", "+endereco.getEstado()+" ("+endereco.getCep()+") | "+endereco.getComplemento());
        else
            System.out.println(endereco.getLogradouro()+", "+endereco.getNumero()+" - "+endereco.getCidade()+", "+endereco.getEstado()+" ("+endereco.getCep()+")");
    }
}
