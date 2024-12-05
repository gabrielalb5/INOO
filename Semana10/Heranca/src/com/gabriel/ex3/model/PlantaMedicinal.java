package com.gabriel.ex3.model;

public class PlantaMedicinal extends Planta {
    private String propriedade;

    public PlantaMedicinal(String nomeCientifico, double altura, String propriedade){    
        super(nomeCientifico,altura);
        this.propriedade = propriedade;    
    }

    public String getPropriedade() {
        return propriedade;
    }

    public void exibirInfos(){
        System.out.println(super.getNomeCientifico()+" é uma planta medicinal de "+getAltura()+"m de altura e sua propriedade é "+getPropriedade());
    }
}
