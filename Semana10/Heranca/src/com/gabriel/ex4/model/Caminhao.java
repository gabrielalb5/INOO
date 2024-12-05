package com.gabriel.ex4.model;

public class Caminhao extends Veiculo{
    private int eixos;
    private String placa;
    private String cor;

    public Caminhao(double capacidadeCarga, int eixos, String placa, String cor){
        super(capacidadeCarga);
        this.eixos = eixos;
        this.placa = placa;
        this.cor = cor;
    }

    public int getEixos() {
        return eixos;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void getDetalhes(){
        System.out.println(" Caminhão\nDetalhes\n|Capacidade de carga: "+super.getCapacidadeCarga()+"\n|Eixos: "+getEixos()+"\n|Placa: "+getPlaca()+"\n|Cor: "+getCor());
    }
}
