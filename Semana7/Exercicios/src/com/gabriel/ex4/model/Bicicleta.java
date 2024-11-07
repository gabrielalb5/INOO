package com.gabriel.ex4.model;

public class Bicicleta {
    private int id;
    private String cor;
    private boolean disponivel = true;
    private String ultimaReserva = null;
    private double precoAluguel;

    public Bicicleta(int id, String cor, double precoAluguel){
        this.id = id;
        this.cor = cor;
        this.precoAluguel = precoAluguel;
    }

    public int getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public String getUltimaReserva() {
        return ultimaReserva;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setUltimaReserva(String ultimaReserva) {
        this.ultimaReserva = ultimaReserva;
    }

    public void relatorioBicicleta(){
        if (disponivel)
            System.out.println(getId()+" - "+getCor()+" está disponível | "+getPrecoAluguel()+" pontos | última reserva: "+getUltimaReserva());
        else
            System.out.println(getId()+" - "+getCor()+" está indisponível | "+getPrecoAluguel()+" pontos | última reserva: "+getUltimaReserva());
    }
}
