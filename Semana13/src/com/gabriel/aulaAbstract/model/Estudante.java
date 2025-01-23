package com.gabriel.aulaAbstract.model;

public class Estudante extends Pessoa {

    public Estudante(String nome, int idade, String instituicao){
        super(nome, idade, instituicao);
    }

    public void minhaRenda(){
        System.out.println(super.getNome()+" recebe auxílio permanência");
    }

    public void apresentacao(){
        System.out.println(super.getNome()+ " diz: Oi, eu sou estudante no "+super.getInstituicao());
    }
}
