package com.gabriel.ex2.model;

public class Estudante extends Pessoa{
    private String prontuario;
    private String curso;

    public Estudante(String nome, String cpf, String prontuario, String curso){
        super(nome, cpf);
        this.prontuario = prontuario;
        this.curso = curso;
    }

    public void exibirDados(){
        System.out.println("---Aluno---\n"+super.getNome()+" ("+super.getCpf()+")\n"+getProntuario()+" cursando "+getCurso());
        System.out.println();
    }

    public String getProntuario() {
        return prontuario;
    }

    public String getCurso() {
        return curso;
    }
    
}
