package com.gabriel.ex5.view;

import com.gabriel.ex5.model.Cliente;
import com.gabriel.ex5.model.Ingresso;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gabriel Albino", "450.143.078-84", 500);
        Cliente c2 = new Cliente("Camilla", "222.222.222-00", 100);

        Ingresso i1 = new Ingresso("Melanie Martinez", 200,  "05/05/2025", "São Paulo - Allianz", "20h");
        Ingresso i2 = new Ingresso("BTS", 500, "30/12/2024", "São Paulo - Allianz", "20h");
        Ingresso i3 = new Ingresso("Mandarine", 50, "30/07/2025", "Araraquara - O inter", "20h");
        Ingresso i4 = new Ingresso("Chromakopia", 0, "20/03/2024", "Sesc Araraquara", "19h");

        c1.comprarIngresso(i1);
        c1.comprarIngresso(i3);
        c1.comprarIngresso(i4);
        c1.listarIngressos();
        c2.comprarIngresso(i2);
        c2.listarIngressos();
        c2.depositar(400);
        c2.comprarIngresso(i2);
        c2.comprarIngresso(i4);
        c2.listarIngressos();
    }
}
