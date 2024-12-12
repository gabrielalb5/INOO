package com.gabriel.ex2.view;

import java.util.ArrayList;

import com.gabriel.ex1.model.Livro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("O investidor de bom senso", "John Bogle", 2020);
        Livro l2 = new Livro("A morte é um dia que vale a pena viver", "Ana Claudia Quintana Arantes", 2016);
        Livro l3 = new Livro("Ainda estou aqui", "Marcelo Rubens Paiva", 2015);

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        for(Livro livro : livros){
            System.out.println(livro);
        }
    }
}
