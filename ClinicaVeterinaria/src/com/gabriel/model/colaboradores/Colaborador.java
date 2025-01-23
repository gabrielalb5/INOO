package com.gabriel.model.colaboradores;

public abstract class Colaborador {
    protected String nome;
    protected String cpf;
    protected String senha;

    public Colaborador(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }
}