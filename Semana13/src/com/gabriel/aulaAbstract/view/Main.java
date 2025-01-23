package com.gabriel.aulaAbstract.view;

import com.gabriel.aulaAbstract.model.Estudante;
import com.gabriel.aulaAbstract.model.Pessoa;
import com.gabriel.aulaAbstract.model.Professor;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Professor("Edilson", 35, "IFSP Araraquara");
        Pessoa a1 = new Estudante("Ana Ligia", 19, "IFSP Araraquara");

        p1.apresentacao();
        p1.minhaRenda();
        System.out.println();
        a1.apresentacao();
        a1.minhaRenda();
    }
}
