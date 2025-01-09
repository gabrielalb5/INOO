package com.gabriel.ex2.model;

public class VIP extends Ingresso {
    private double adicional;

    public VIP(String nome, double valor, double adicional){
        super(nome, valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    @Override
    public void imprimeValor(){
        System.out.println(getNome()+" - R$"+getValor());
        System.out.println("Ingresso VIP +R$"+getAdicional());
        double soma = getValor()+getAdicional();
        System.out.println("Total R$"+soma);
    }
}
