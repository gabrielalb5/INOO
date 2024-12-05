package com.gabriel.ex2.view;

import com.gabriel.ex2.model.Estudante;
import com.gabriel.ex2.model.Professor;

public class Main {
    public static void main(String[] args) {
       Professor p1 = new Professor("Edilson Cândido", "027.852.101-03", "Informática", 2011);
       Professor p2 = new Professor("Rafhael Borgato", "259.150.623-12", "Inglês", 2016);
       
       Estudante e1 = new Estudante("Gabriel Albino", "505.204.436-27", "AQ3004775", "TSI");

       p1.exibirDados();
       e1.exibirDados();
       p2.exibirDados();
    }
}