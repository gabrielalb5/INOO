package view;

import model.Endereco;

public class Pessoa {
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua abc");

        System.out.println(e.getRua());
    }
}
