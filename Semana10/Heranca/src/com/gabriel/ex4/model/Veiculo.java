package com.gabriel.ex4.model;

public class Veiculo {
    protected double capacidadeCarga;

    public Veiculo(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void getDetalhes(){
        System.out.println("capacidade de carga: "+getCapacidadeCarga());
    }
}
