package view;

import model.Calculadora;
import model.Estudante;

public class TesteCalculadora {
    public static void main(String[] args) {
        Estudante e = new Estudante("Maria","aq3002020", 21);
        System.out.println(e.getNome());
    }
}
