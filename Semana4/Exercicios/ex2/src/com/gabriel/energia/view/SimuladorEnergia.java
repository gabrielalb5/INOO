package com.gabriel.energia.view;

import com.gabriel.energia.model.GeradorSolar;

public class SimuladorEnergia {
    public static void main(String[] args) {
        GeradorSolar gs1 = new GeradorSolar(200,50);
        GeradorSolar gs2 = new GeradorSolar(100,5);

        verificar(gs1);
        verificar(gs2);
    }

    public static void verificar(GeradorSolar gerador) {
        if (gerador.getEnergiaGerada() > 10) {
            System.out.println("Superavit energético (" + gerador.getEnergiaGerada() + " kWh) no gerador de potência máxima = " + gerador.getPotenciaMaxima() + " kW");
        } else {
            System.out.println("Déficit energético (" + gerador.getEnergiaGerada() + " kWh) no gerador de potência máxima = " + gerador.getPotenciaMaxima() + " kW");
        }
    }
}
