package com.gabriel.drones.model;

public class Drone {
    private int id;
    private double distanciaPercorrida;

    public Drone(int id){
        this.id = id;
        this.distanciaPercorrida = 0;
    }

    public double getDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }

    public int getId() {
        return this.id; // Método para obter o ID do drone
    }

    public void voar(){
        double distancia = Math.random() * 10; 
        this.distanciaPercorrida += distancia;
    }
    
}