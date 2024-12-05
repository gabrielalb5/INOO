package com.gabriel.ex3.model;

public class Planta {
    protected String nomeCientifico;
    protected double altura;

    public Planta(String nomeCientifico, double altura){
        this.nomeCientifico = nomeCientifico;
        this.altura = altura;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public double getAltura() {
        return altura;
    }
}
