package com.gabriel.ex3.model;

public class PlantaOrnamental extends Planta{
    private String cor;
    
    public PlantaOrnamental(String nomeCientifico, double altura, String cor){
        super(nomeCientifico, altura);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void exibirInfos(){
        System.out.println(super.getNomeCientifico()+" é uma planta ornamental de "+getAltura()+"m de altura de cor "+getCor());
    }
}
