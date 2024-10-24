package com.gabriel.sistemaCadastro.model;

public class Cliente {
    private String nome, email;
    private int idade;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.email = "INDEFINIDO";
    }

    public Cliente(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public int getIdade() {
        return idade;
    } 

}
