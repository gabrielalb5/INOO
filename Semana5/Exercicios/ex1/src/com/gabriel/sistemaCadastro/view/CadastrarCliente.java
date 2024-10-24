package com.gabriel.sistemaCadastro.view;

import com.gabriel.sistemaCadastro.model.Cliente;

public class CadastrarCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ana Ligia",19);
        Cliente c2 = new Cliente("Ana Ligia",19,"ana.ligia@email.com");

        System.out.println("Nome: "+c1.getNome()+" ("+c1.getEmail()+") - "+c1.getIdade()+" anos");
        System.out.println("Nome: "+c2.getNome()+" ("+c2.getEmail()+") - "+c2.getIdade()+" anos");

    }
}
