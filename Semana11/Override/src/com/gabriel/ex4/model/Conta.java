package com.gabriel.ex4.model;

public class Conta {
    protected int numeroConta;
    protected double saldo;

    public Conta(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double corrigir(){
        return getSaldo() * 1.05;
    }
}
