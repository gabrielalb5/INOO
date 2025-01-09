package com.gabriel.ex1.model;

public class Gerente extends Funcionario {
    public Gerente(String nome, String email, double salario){
        super(nome, email, salario);
    }

    @Override
    public void bonificar(){
        System.out.println(super.getNome()+" bonificado com 40% ou R$ "+calcularBonus());
    }

    @Override
    public double calcularBonus(){
        return super.getSalario() * 0.4;
    }
}
