package com.gabriel.ex1.model;

public class Filme extends Conteudo {
    private String diretor;
    private String orcamento;

    public Filme(String titulo, int duracao, String diretor, String orcamento){
        super(diretor, duracao);
        this.diretor = diretor;
        this.orcamento = orcamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void exibirInfo(){
        System.out.println(getTitulo()+" ("+getDuracao()+" min) - "+getDiretor()+" custou "+getOrcamento());
    }
}
