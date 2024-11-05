package view;

import model.Cliente;
import model.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Livro: Entendendo Algoritmos", 45.90, "06 de novembro de 2024");
        Cliente cliente = new Cliente("Gabriel Albino", "Av. Brasil 505", pedido);
        cliente.exibirPedido();
    }
}