package com.gabriel.robos.model;

public class RoboEntrega {
    private int id;
    private String localAtual;
    private int entregasRealizadas;
    private double distanciaTotal;

    public RoboEntrega(int id, String localAtual){
        this.id = id;
        this.localAtual = localAtual;
        this.entregasRealizadas = 0;
        this.distanciaTotal = 0;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public String getLocalAtual() {
        return this.localAtual;
    }

    public int getEntregasRealizadas() {
        return this.entregasRealizadas;
    }

    public int getId() {
        return this.id;
    }

    public void calcularDistancia(String local1, String local2){
        double distancia;
        distancia = 1 + (int) (Math.random() * 20);
        System.out.println("Robô "+this.id+" saiu para entrega");
        System.out.println("Distância entre "+local1+" e "+local2+" = "+distancia+" Km\n");
        this.entregasRealizadas++;
        this.localAtual = local2;
        this.distanciaTotal += distancia;
    }
}
