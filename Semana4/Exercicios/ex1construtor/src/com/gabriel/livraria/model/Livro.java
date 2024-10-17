package com.gabriel.livraria.model;

public class Livro {
    String titulo;
    String autor;
    double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        if(preco<0){
            System.out.println("O preço não pode ser negativo");
        }else{
            this.preco = preco;  
        }
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public double getPreco(){
        return this.preco;
    }
}