package com.gabriel.ex4.model;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numeroConta, double saldo){
        super(numeroConta, saldo);
    }
    
    public double corrigir(){
        return getSaldo() * 1.1;
    }
}
