package com.gabriel.ex4.model;

public class Barco extends Veiculo{
    private String tamanho;
    private String bandeira;
    private int tripulantes;

    public Barco(double capacidadeCarga, String tamanho, String bandeira, int tripulantes){
        super(capacidadeCarga);
        this.tamanho = tamanho;
        this.bandeira = bandeira;
        this.tripulantes = tripulantes;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getBandeira() {
        return bandeira;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public void getDetalhes(){
        System.out.println(" Barco\nDetalhes\n|Capacidade de carga: "+super.getCapacidadeCarga()+"\n|Tamanho: "+getTamanho()+"\n|Bandeira: "+getBandeira()+"\n|Tripulantes: "+getTripulantes());
    }
}
