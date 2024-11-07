package com.gabriel.ex4.model;

public class Bicicleta {
    private int id;
    private String modelo;
    private boolean disponivel;
    private String ultimaReserva = null;

    public Bicicleta(int id, String modelo, boolean disponivel){
        this.id = id;
        this.modelo = modelo;
        this.disponivel = disponivel;
    }
}
