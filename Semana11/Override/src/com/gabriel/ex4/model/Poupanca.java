package com.gabriel.ex4.model;

public class Poupanca extends Conta{
    
    public Poupanca(int numeroConta, double saldo){
        super(numeroConta, saldo);
    }
    
    public double corrigir(){
        return getSaldo();
    }
}
