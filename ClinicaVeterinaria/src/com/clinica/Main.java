package com.clinica;

import java.util.ArrayList;

import com.clinica.model.Tutor;
import com.clinica.model.animais.Animal;
import com.clinica.model.colaboradores.Colaborador;
import com.clinica.model.colaboradores.Groomer;
import com.clinica.view.Menu;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tutor> tutores = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        Menu menu = new Menu(tutores, animais, colaboradores);

        Colaborador c1 = new Groomer("Gabriel", "450", "1234");
        colaboradores.add(c1);

        menu.menuInicial();
    }
}