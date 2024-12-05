package com.gabriel.ex4.view;

import com.gabriel.ex4.model.Aviao;
import com.gabriel.ex4.model.Barco;
import com.gabriel.ex4.model.Caminhao;
import com.gabriel.ex4.model.Moto;

public class Main {
    public static void main(String[] args) {
        Aviao a1 = new Aviao(64000, 21);
        Barco b1 = new Barco(400000, "400x61", "Brasil", 50);
        Caminhao c1 = new Caminhao(33000, 2, "BRA3R52", "Branco");
        Moto m1 = new Moto(150);

        int carga = 500;
        int dias = 5;
        //Cliente escolheu barco
        System.out.print("Será transportada uma carga de "+carga+"kg que chegará em até "+dias+" dias\nO transporte escolhido foi");
        b1.getDetalhes();

    }
}
