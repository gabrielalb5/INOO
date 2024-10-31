package model;

public class Pessoa {
    private String nome;
    private Carro carro;

    public Pessoa(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }

    public void exibirDados(){
        System.out.println(nome + " comprou um " + carro.getModelo() + " " + carro.getCor() + " (" + carro.getPlaca() + ")");
    }
}
