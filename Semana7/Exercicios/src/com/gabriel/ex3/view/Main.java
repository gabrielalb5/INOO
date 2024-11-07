package com.gabriel.ex3.view;

import com.gabriel.ex3.model.Estudante;
import com.gabriel.ex3.model.Livro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Java para Iniciantes", "Herbert Schildt");
        Livro l2 = new Livro("Use a Cabeça Java", "Kathy Sierra");

        Estudante e1 = new Estudante("João");
        Estudante e2 = new Estudante("Maria");

        e1.emprestarLivro(l1);
        e2.emprestarLivro(l1);

        e1.devolverLivro();

        e2.emprestarLivro(l1);
        e2.emprestarLivro(l2);
    }
}
