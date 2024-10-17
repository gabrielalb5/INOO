package com.gabriel.livraria.view;

import com.gabriel.livraria.model.Livro;

public class Livraria {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setTitulo("Os Sete Maridos de Evelyn Hugo");
        l1.setAutor("Taylor Jenkins Reid");
        l1.setPreco(30);

        Livro l2 = new Livro();
        l2.setTitulo("Quinze Dias");
        l2.setAutor("Vitor Martins");
        l2.setPreco(20);

        Livro l3 = new Livro();
        l3.setTitulo("A Hora da Estrela");
        l3.setAutor("Clarice Lispector");
        l3.setPreco(25);

        System.out.println("Título: "+l1.getTitulo()+" - "+l1.getAutor()+" (R$"+l1.getPreco()+")");
        System.out.println("Título: "+l2.getTitulo()+" - "+l2.getAutor()+" (R$"+l2.getPreco()+")");
        System.out.println("Título: "+l3.getTitulo()+" - "+l3.getAutor()+" (R$"+l3.getPreco()+")");

    }
}
