package view;

import model.Carro;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol","ABC1234","Wolksvagen","Preto");
        Pessoa pessoa = new Pessoa("Gabriel", carro);

        pessoa.exibirDados();
    }
}
