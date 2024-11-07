package com.gabriel.ex1.view;

import com.gabriel.ex1.model.Cliente;
import com.gabriel.ex1.util.Validador;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 18);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());

        if(Validador.validarIdade(cliente))
            System.out.println("Tem mais de 18 anos");
        else
            System.out.println("Tem menos de 18 anos");
    }
}
