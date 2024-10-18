package com.gabriel.biblioteca.model;

public class Biblioteca {
    private Livro[] livros;

    public Biblioteca(Livro[] livros){
        this.livros = livros;
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("> " + livro.getTitulo() + " - " + livro.getAutor());
            }
        }
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.emprestarLivro();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolverLivro();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
