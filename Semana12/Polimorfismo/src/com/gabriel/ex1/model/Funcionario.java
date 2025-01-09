package com.gabriel.ex1.model;

public class Funcionario {
    private String nome;
    private String email;
    private double salario;

    public Funcionario(String nome, String email, double salario){
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void bonificar(){
        System.out.println(nome+" bonificado com 10% ou R$ "+calcularBonus());
    }

    public double calcularBonus(){
        return getSalario() * 0.1;
    }
}
