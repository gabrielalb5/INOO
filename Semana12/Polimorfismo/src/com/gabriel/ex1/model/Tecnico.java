package com.gabriel.ex1.model;

public class Tecnico extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Tecnico(String nome, String email, double salario, String identificador, String turno, double adicionalNoturno){
        super(nome, email, salario, identificador);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }
    
    @Override
    public void bonificar(){
        if(turno == "Noturno"){
            adicionalNoturno = 100;
        }
        System.out.println(super.getNome()+" (Técnico  "+super.getIdentificador()+") bonificado com 10% ou R$ "+calcularBonus()+" e adicional noturno R$"+getAdicionalNoturno());
    }

    
}
