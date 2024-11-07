package com.gabriel.ex2.model;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento = "";
    private String cep;
    private String cidade;
    private String estado;

    //Sem complemento
    public Endereco(String logradouro, String numero, String cep, String cidade, String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    //Com complemento
    public Endereco(String logradouro, String numero, String cep, String cidade, String estado, String complemento){
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
