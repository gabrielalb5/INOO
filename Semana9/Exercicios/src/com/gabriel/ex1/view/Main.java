package com.gabriel.ex1.view;

import java.util.ArrayList;

import com.gabriel.ex1.model.Estudante;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = new ArrayList<>();

        Estudante e1 = new Estudante("Gabriel", 19, "AQ3005555");
        Estudante e2 = new Estudante("Ana Ligia", 19, "AQ3002222");
        Estudante e3 = new Estudante("Eduardo", 20, "AQ3007777");

        estudantes.add(e1);
        estudantes.add(e2);
        estudantes.add(e3);

        System.out.println("Total de estudantes: "+estudantes.size());

        for (Estudante estudante : estudantes) {
            System.out.println(estudante.getNome()+", "+estudante.getIdade()+" anos ("+estudante.getProntuario()+")");
        }
    }
}
