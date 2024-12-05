package com.gabriel.ex1.view;

import com.gabriel.ex1.model.Filme;
import com.gabriel.ex1.model.Serie;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("The Wizard of Oz", 102, "Victor Fleming", "US$ 2,8 Milhões");
        Filme f2 = new Filme("Aftersun", 101, "Charlotte Wells", "US$ 35 Milhões");
        Filme f3 = new Filme("AAinda Estou Aqui", 135, "Walter Salles", "R$ 8 Milhões");

        Serie s1 = new Serie("Bebê Rena", 237, 1, 7);

        f1.exibirInfo();
        f2.exibirInfo();
        f3.exibirInfo();

        s1.exibirInfo();
    }
}
