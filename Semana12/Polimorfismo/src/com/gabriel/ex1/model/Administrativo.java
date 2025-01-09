package com.gabriel.ex1.model;

public class Administrativo extends Assistente{
    private double bonusSalarial = 0;

    public Administrativo(String nome, String email, double salario, String identificador, double bonusSalarial){
        super(nome, email, salario, identificador);
        this.bonusSalarial = bonusSalarial;
    }
    public double getBonusSalarial() {
        return bonusSalarial;
    }

    @Override
    public double calcularBonus(){
        return super.getSalario() * 0.2;
    }

    @Override
    public void bonificar(){
        System.out.println(super.getNome()+" (Administrativo "+super.getIdentificador()+") bonificado com 20% ou R$ "+calcularBonus());
        bonusSalarial = bonusSalarial+calcularBonus();
    }

    public void exibirBonus(){
        System.out.println(super.getNome()+" (Administrativo "+super.getIdentificador()+") tem um bônus de "+getBonusSalarial());
    }
}
