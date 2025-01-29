package com.clinica;

import java.util.ArrayList;

import com.clinica.model.Tutor;
import com.clinica.model.animais.*;
import com.clinica.model.colaboradores.*;
import com.clinica.view.Menu;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tutor> tutores = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        Menu menu = new Menu(tutores, animais, colaboradores);

        Colaborador g1 = new Groomer("Gabriel", "450", "1234");
        Colaborador v1 = new Veterinario("Caio", "400", "1234");
        colaboradores.add(g1);
        colaboradores.add(v1);

        menu.menuInicial(tutores, colaboradores, animais);
    }
}