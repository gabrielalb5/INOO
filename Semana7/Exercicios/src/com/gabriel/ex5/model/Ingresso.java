package com.gabriel.ex5.model;

public class Ingresso {
    private String show;
    private double preco;
    private String local;
    private String data;
    private String horario;

    public Ingresso(String show, double preco, String data, String local, String horario){
        this.show = show;
        this.preco = preco;
        this.local = local;
        this.data = data;
        this.horario = horario;
    }

    public String getShow() {
        return show;
    }

    public double getPreco() {
        return preco;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

}
