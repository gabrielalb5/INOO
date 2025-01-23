package com.gabriel;

import java.util.ArrayList;

import com.gabriel.model.Tutor;
import com.gabriel.model.animais.Animal;
import com.gabriel.model.colaboradores.Colaborador;
import com.gabriel.view.Menu;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tutor> tutores = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        Menu menu = new Menu(tutores, animais, colaboradores);

        menu.menuInicial();
    }
}