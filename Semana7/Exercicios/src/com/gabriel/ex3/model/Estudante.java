package com.gabriel.ex3.model;

public class Estudante {
    private String nome;
    private Livro livro = null;

    public Estudante(String nome){
        this.nome = nome;
    }

    public void emprestarLivro(Livro livro){
        if(this.livro==null){
            if(livro.getEmprestado()){   
                System.out.println(getNome()+", o livro \""+livro.getTitulo()+"\" já está emprestado");
            }else{
                this.livro = livro;
                livro.setEmprestado(true);
                System.out.println(getNome()+", livro \""+livro.getTitulo()+"\" emprestado com sucesso!");
            }
        }else{
            System.out.println(getNome()+", você não pode emprestar outro livro!");
        }   
    }

    public void devolverLivro(){
        if(this.livro == null){
            System.out.println(getNome()+", não há livros para devolver");
        }else{
            this.livro.setEmprestado(false);
            System.out.println(getNome()+", livro \""+livro.getTitulo()+"\" devolvido!");
        }
    }

    public String getNome() {
        return nome;
    }
}
