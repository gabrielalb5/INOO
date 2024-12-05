package com.gabriel.ex3.view;

import com.gabriel.ex3.model.PlantaMedicinal;
import com.gabriel.ex3.model.PlantaOrnamental;

public class Main {
    public static void main(String[] args) {
        PlantaOrnamental po1 = new PlantaOrnamental("Phlebodium aureum", 0.4, "Azul");
        PlantaOrnamental po2 = new PlantaOrnamental("Dieffenbachia seguine", 1.5, "Verde zebrado");

        PlantaMedicinal pm1 = new PlantaMedicinal("Cannabis sativa", 5, "sedativa");
        PlantaMedicinal pm2 = new PlantaMedicinal("Aloe Vera", 2, "anti-inflamatória, antioxidante, cicatrizante, emoliente, hidratante e nutritivas");

        pm1.exibirInfos();
        pm2.exibirInfos();
        po1.exibirInfos();
        po2.exibirInfos();
    }
}
