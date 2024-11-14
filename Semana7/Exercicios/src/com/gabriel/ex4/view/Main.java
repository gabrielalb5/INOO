package com.gabriel.ex4.view;

import com.gabriel.ex4.model.Bicicleta;
import com.gabriel.ex4.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Gabriel Albino", "123.456.789-00", "gabrielalbino@gmail.com");
        Usuario u2 = new Usuario("Caio S. Lopes", "333.555.777-10", "Caiovb@gmail.com");
        Bicicleta b0 = new Bicicleta(0, "Rosa parachoque", 10);
        Bicicleta b1 = new Bicicleta(1, "Azul goiaba", 15);
        Bicicleta b2 = new Bicicleta(2, "Branco beringela", 30);
        Bicicleta b3 = new Bicicleta(3, "Preto caramelado", 20);

        u1.reservarBicicleta(b0); //Gabriel não reserva Rosa - sem crédito
        u1.creditar(50); //Gabriel é creditado com 50 pts
        u1.reservarBicicleta(b0); //Gabriel reserva Rosa 

        b0.relatorioBicicleta();
        b2.relatorioBicicleta();

        u2.creditar(0); //Crédito inválido
        u2.creditar(30); //Caio recebe 30 pts
        u2.reservarBicicleta(b2); //Caio reserva Branco
        b2.relatorioBicicleta(); //Relatório da bicicleta Branco

        u1.reservarBicicleta(b2); //Gabriel tenta reservar a bicicleta que está com Caio
        b2.relatorioBicicleta();

        u1.devolverBicicleta(); //Gabriel devolve a bicicleta Rosa
        u1.reservarBicicleta(b2); //Gabriel tenta reservar a bicicleta que está com Caio
        b2.relatorioBicicleta();

        u2.devolverBicicleta(); //Caio devolve a bicicleta
        b2.relatorioBicicleta();

        u1.reservarBicicleta(b2); //Gabriel finalamente consegue emprestar a bicicleta Branco

        //Últimos relatórios
        b0.relatorioBicicleta();
        b2.relatorioBicicleta();

        u1.relatorioUsuario();
        u2.relatorioUsuario();
    }
}
