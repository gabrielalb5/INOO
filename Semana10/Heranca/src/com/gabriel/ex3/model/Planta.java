package com.gabriel.ex3.model;

public class Planta {
    private String nomeCientifico;
    private double altura;

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
