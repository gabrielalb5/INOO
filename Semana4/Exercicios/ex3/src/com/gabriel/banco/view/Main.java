package com.gabriel.banco.view;

import com.gabriel.banco.model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("000123-45",0);

        conta.getSaldo();
        conta.depositar(100);
        conta.getSaldo();
        conta.sacar(-10);
        conta.depositar(-10);
        conta.sacar(20);
        conta.getSaldo();
    }
}
