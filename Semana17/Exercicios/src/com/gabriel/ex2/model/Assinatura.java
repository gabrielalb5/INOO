package com.gabriel.ex2.model;

public abstract class Assinatura implements IRenovavel{
    protected String assinante;
    protected String descricao;
    protected String data;
    protected boolean anual;
    protected boolean ativa;
    protected double preco;

    public Assinatura(String assinante, String descricao, String data, boolean anual, boolean ativa, double preco){
        this.assinante = assinante;
        this.descricao = descricao;
        this.data = data;
        this.anual = anual;
        this.ativa = ativa;
        this.preco = preco;

    }

    public String getAssinante() {
        return assinante;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isAnual() {
        return anual;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setAnual(boolean anual) {
        this.anual = anual;
    }

    public abstract double calcularTotalPago();
    public abstract void detalhesAssinatura();
}
