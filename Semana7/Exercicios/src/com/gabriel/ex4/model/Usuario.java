package com.gabriel.ex4.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String bicicletaReservada = null;
    private int saldoCreditos = 0;

    public Usuario(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
}
