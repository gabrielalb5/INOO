package com.gabriel.biblioteca;

import com.gabriel.biblioteca.model.Biblioteca;
import com.gabriel.biblioteca.model.Livro;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = new Livro[5];
        livros[0] = new Livro("1984", "George Orwell");
        livros[1] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        livros[2] = new Livro("Dom Casmurro", "Machado de Assis");
        livros[3] = new Livro("A Revolução dos Bichos", "George Orwell");
        livros[4] = new Livro("Cem Anos de Solidão", "Gabriel García Márquez");

        Biblioteca biblioteca = new Biblioteca(livros);
        
        biblioteca.listarLivrosDisponiveis();
        
        biblioteca.emprestarLivro("1984");
        biblioteca.emprestarLivro("Dom Casmurro");
        
        System.out.println("\nApós empréstimos:");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("\nTentando emprestar Dom Casmurro, já emprestado:");
        biblioteca.emprestarLivro("Dom Casmurro");
        
        biblioteca.devolverLivro("1984");
        
        System.out.println("\nApós devolução de '1984':");
        biblioteca.listarLivrosDisponiveis();
    }
}
