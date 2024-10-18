package com.gabriel.naves.model;

public class Nave {
    private String nome;
    private int escudo;
    
    public Nave(String nome, int escudo){
        this.nome = nome;
        this.escudo = escudo;
    }

    public String getNome(){
        return this.nome;
    }

    public int getEscudo(){
        return this.escudo;
    }

    public void receberDano(int dano){
        System.out.println("\nEstrela da Morte atacou "+this.nome+"!");
        System.out.println("-"+dano+" HP");
        if(this.escudo<dano){
            this.escudo = 0;
            System.out.println(this.nome+" explodiu!");
        }else{
            this.escudo -= dano;
        }
    }

    public void reparar(int valor){
        System.out.println("\nR2-D2 reparou "+this.nome);
        this.escudo += valor;
        System.out.println("+"+valor+" HP");
    }
}