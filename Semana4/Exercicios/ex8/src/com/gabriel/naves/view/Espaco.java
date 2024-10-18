package com.gabriel.naves.view;
import com.gabriel.naves.model.Nave;

public class Espaco {
    public static void main(String[] args) {
        Nave[] naves = new Nave[2];

        naves[0] = new Nave("X-Wing",200);
        naves[1] = new Nave("Millennium Falcon",500);

        System.out.println("STAR WARS");
        imprimirNaves(naves);
        naves[0].receberDano(100);
        naves[1].receberDano(300);
        imprimirNaves(naves);
        naves[0].reparar(20);
        imprimirNaves(naves);
        naves[1].receberDano(100);
        imprimirNaves(naves);
        naves[1].reparar(200);
        imprimirNaves(naves);
        naves[0].receberDano(300);
        imprimirNaves(naves);
    }

    public static void imprimirNaves(Nave[] naves){
        boolean capazDeVoar = true;
        for(Nave nave : naves){
            if(nave.getEscudo()==0){
                capazDeVoar = false;
            }
        }
        if(capazDeVoar){
            System.out.println("\nHP DAS NAVES");
            for(Nave nave : naves){
                System.out.println(nave.getNome()+": "+nave.getEscudo()+" HP");
            }
        }else{
        System.out.println("Fim de jogo...");
        }
        
    }
}
