package com.gabriel.ex4.model;

public class Aviao extends Veiculo{
    private double autonomia;

    public Aviao(double capacidadeCarga, double autonomia){
        super(capacidadeCarga);
        this.autonomia = autonomia;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void getDetalhes(){
        System.out.println(" Avião\nDetalhes\n|Capacidade de carga: "+super.getCapacidadeCarga()+"\n|Autonomia: "+getAutonomia()+" km");
    }
}
