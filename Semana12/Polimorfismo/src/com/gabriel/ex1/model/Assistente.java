package com.gabriel.ex1.model;

public class Assistente extends Funcionario {
    private String identificador;

    public Assistente(String nome, String email, double salario, String identificador){
        super(nome, email, salario);
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }
}
