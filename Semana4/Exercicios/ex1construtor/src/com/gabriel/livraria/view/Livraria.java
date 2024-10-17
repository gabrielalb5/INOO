package com.gabriel.livraria.view;

import com.gabriel.livraria.model.Livro;

public class Livraria {
    public static void main(String[] args) {
        Livro l1 = new Livro("Os Sete Maridos de Evelyn Hugo","Taylor Jenkins Reid",30);
        Livro l2 = new Livro("Quinze Dias","Vitor Martins",20);
        Livro l3 = new Livro("A Hora da Estrela","Clarice Lispector",25);

        System.out.println("Título: "+l1.getTitulo()+" - "+l1.getAutor()+" (R$"+l1.getPreco()+")");
        System.out.println("Título: "+l2.getTitulo()+" - "+l2.getAutor()+" (R$"+l2.getPreco()+")");
        System.out.println("Título: "+l3.getTitulo()+" - "+l3.getAutor()+" (R$"+l3.getPreco()+")");

    }
}
