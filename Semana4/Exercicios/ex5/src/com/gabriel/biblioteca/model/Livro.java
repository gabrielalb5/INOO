package com.gabriel.biblioteca.model;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    
    public boolean isDisponivel(){
        return this.disponivel;
    }
    
    public void emprestarLivro(){
        if (this.disponivel) {
            this.disponivel = false;
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }
    
    public void devolverLivro(){
        this.disponivel = true;
    }
}
