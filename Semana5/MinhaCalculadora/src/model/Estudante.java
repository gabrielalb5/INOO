package model;

public class Estudante {
    private String nome;
    private String matricula;
    private int idade;

    public Estudante(){
        this.nome = "Provisório";
    }

    public Estudante(String nome){
        this.nome = nome;
    }

    public Estudante(String nome, String matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
}
