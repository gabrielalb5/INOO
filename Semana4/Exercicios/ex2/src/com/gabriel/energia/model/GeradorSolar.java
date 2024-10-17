package com.gabriel.energia.model;

public class GeradorSolar {
    private double potenciaMaxima;
    private double energiaGerada;

    public GeradorSolar(double potenciaMaxima, double energiaGerada){
        this.potenciaMaxima = potenciaMaxima;
        this.energiaGerada = energiaGerada;
    }

    public double getPotenciaMaxima(){
        return this.potenciaMaxima;
    }

    public double getEnergiaGerada(){
        return this.energiaGerada;
    }
}