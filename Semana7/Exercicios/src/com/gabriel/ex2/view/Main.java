package com.gabriel.ex2.view;

import com.gabriel.ex2.model.Cliente;
import com.gabriel.ex2.util.Validador;
import com.gabriel.ex2.model.Endereco;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Av. Limoeiro", "505", "14000-350", "Araraquara", "SP");
        Cliente cliente = new Cliente("Jõao", 30, endereco);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());

        if(Validador.validarIdade(cliente))
            System.out.println("Tem mais de 18 anos");
        else
            System.out.println("Tem menos de 18 anos");

        cliente.exibirEndereco();
    }
}
