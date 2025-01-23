package com.gabriel.model.animais;

import com.gabriel.model.Tutor;

public abstract class Animal implements ICaracteristicas {
    protected int id;
    protected String nome;
    protected int idade;
    protected boolean saudavel;
    protected boolean limpo;
    protected Tutor tutor;

    private static int contador = 0;

    public Animal(String nome, int idade) {
        this.id = contador++;
        this.nome = nome;
        this.idade = idade;
    }

    public Animal(String nome, int idade, Tutor tutor) {
        this.id = contador++;
        this.nome = nome;
        this.idade = idade;
        this.tutor = tutor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
