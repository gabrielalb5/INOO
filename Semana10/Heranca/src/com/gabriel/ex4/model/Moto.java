package com.gabriel.ex4.model;

public class Moto extends Veiculo{
    
    public Moto(double capacidadeCarga){
        super(capacidadeCarga);
    }

    public void getDetalhes(){
        System.out.println(" Moto\nDetalhes\n|Capacidade de carga: "+super.getCapacidadeCarga());
    }
}
