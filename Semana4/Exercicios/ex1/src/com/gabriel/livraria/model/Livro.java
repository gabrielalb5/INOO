package com.gabriel.livraria.model;

public class Livro {
    String titulo;
    String autor;
    double preco;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPreco(double preco){
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