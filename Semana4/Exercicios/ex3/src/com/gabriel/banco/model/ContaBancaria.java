package com.gabriel.banco.model;

public class ContaBancaria {
    String numeroConta;
    double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void getSaldo(){
        System.out.printf("Saldo atual - R$%.2f\n",this.saldo);
    }

    public void depositar(double valor){
        if(valor<0){
            System.out.println("O valor depositado não pode ser negativo.");
        }else{
            this.saldo += valor;
            System.out.println("Valor de R$"+valor+" depositado.");
        }
    }

    public void sacar(double valor){
        if(valor<=saldo && valor>0){
            this.saldo -= valor;
            System.out.println("Valor de R$"+valor+" sacado.");
        }else{
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }
}
