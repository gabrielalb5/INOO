package com.gabriel.drones.view;

import com.gabriel.drones.model.Drone;

public class ControleDrones {
    public static void main(String[] args) {
        Drone[] drones = new Drone[5];

        double distanciaTotal = 0;

        for(int i=0;i<drones.length;i++){
            drones[i] = new Drone(i + 1);
        }

        for (Drone drone : drones) {
            drone.voar();
        }

        System.out.println("Distâncias percorridas por cada drone:");
        for (Drone drone : drones) {
            System.out.printf("Drone %d: %.2f km%n", drone.getId(), drone.getDistanciaPercorrida());
            distanciaTotal += drone.getDistanciaPercorrida();
        }

        System.out.printf("Soma total das distâncias percorridas por todos os drones: %.2f km",distanciaTotal);

    }
}
