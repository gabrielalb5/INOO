package com.gabriel.aulaAbstract.model;

public class Professor extends Pessoa {

    public Professor(String nome, int idade, String instituicao){
        super(nome, idade, instituicao);
    }

    public void minhaRenda(){
        System.out.println(super.getNome()+" ganha muito dinheiro");
    }

    public void apresentacao(){
        System.out.println(super.getNome()+ " diz: Oi, eu sou professor no "+super.getInstituicao());
    }
}