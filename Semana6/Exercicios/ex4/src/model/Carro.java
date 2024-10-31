package model;

public class Carro {
    private String modelo;
    private String placa;
    private String marca;
    private String cor;

    public Carro(String modelo, String placa, String marca, String cor){
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

}
