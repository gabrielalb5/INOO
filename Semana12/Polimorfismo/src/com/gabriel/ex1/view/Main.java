package com.gabriel.ex1.view;
import com.gabriel.ex1.model.Administrativo;
import com.gabriel.ex1.model.Funcionario;
import com.gabriel.ex1.model.Gerente;
import com.gabriel.ex1.model.Tecnico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Gerente g = new Gerente("Caio", "caio@mail.com", 5000);
        Administrativo adm1 = new Administrativo("Ana Beatriz", "anab@mail.com", 2100, "ADM123", 0);
        Administrativo adm2 = new Administrativo("Gabrielle", "gabi@mail.com", 2000, "ADM456", 0);
        Tecnico tec1 = new Tecnico("Gabriel Albino", "gabriel@mail.com", 2500, "TEC555", "Noturno", 0);
        Tecnico tec2 = new Tecnico("Eduardo", "edu@mail.com", 2000, "TEC123", "Diurno", 0);
        Tecnico tec3 = new Tecnico("Ana Ligia", "anali@mail.com", 2000, "TEC456", "Diurno", 0);

        funcionarios.add(g);
        funcionarios.add(adm1);
        funcionarios.add(adm2);
        funcionarios.add(tec1);
        funcionarios.add(tec2);
        funcionarios.add(tec3);

        for (Funcionario f: funcionarios){
            f.bonificar();
        }
    }
}