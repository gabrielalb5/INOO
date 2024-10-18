package com.gabriel.robos.view;
import com.gabriel.robos.model.RoboEntrega;

public class CentralLogistica {
    public static void main(String[] args) {
        RoboEntrega[] robos = new RoboEntrega[2];
        robos[0] = new RoboEntrega(1,"Correios Araraquara");
        robos[1] = new RoboEntrega(2,"Correios Araraquara");

        mostrarRobos(robos);
        robos[0].calcularDistancia("Yolanda", "Hortências");
        robos[0].calcularDistancia("Hortências", "Parque São Paulo");
        robos[1].calcularDistancia("Selmi Dei", "Cecap");
        mostrarRobos(robos);
        robos[1].calcularDistancia("Cecap", "Jardim Botânico");
        robos[1].calcularDistancia("Jardim Botânico", "Universal");
        mostrarRobos(robos);
    }

    public static void mostrarRobos(RoboEntrega[] robos){
        System.out.println("---------------------------------------");
        System.out.println("| STATUS DOS ENTREGADORES");
        double distanciaGeral = 0;
        double entregaGeral = 0;
        for(RoboEntrega robo : robos){
            System.out.println("| Robô "+robo.getId()+" - "+robo.getEntregasRealizadas()+" entregas\n| Local atual: "+robo.getLocalAtual()+"\n| Distância percorrida: "+robo.getDistanciaTotal()+" Km\n");
            distanciaGeral += robo.getDistanciaTotal();
            entregaGeral += robo.getEntregasRealizadas();
        }
        System.out.println("| TOTAL DE ENTREGAS: "+entregaGeral);
        System.out.println("| DISTÂNCIA TOTAL: "+distanciaGeral+" Km");
        System.out.println("---------------------------------------\n");
    }
}
