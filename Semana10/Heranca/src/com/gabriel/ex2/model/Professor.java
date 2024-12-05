package com.gabriel.ex2.model;

public class Professor extends Pessoa{
    private String departamento;
    private int anoContratacao;

    public Professor(String nome, String cpf, String departamento, int anoContratacao){
        super(nome,cpf);
        this.departamento = departamento;
        this.anoContratacao = anoContratacao;
    }

    public void exibirDados(){
        System.out.println("---Professor---\n"+super.getNome()+" ("+super.getCpf()+")\n"+getDepartamento()+" - contratado em "+getAnoContratacao());
        System.out.println();
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    // public String getNome() {
    //     return super.getNome();
    // }

    // public String getCpf() {
    //     return super.getCpf();
    // }
}
