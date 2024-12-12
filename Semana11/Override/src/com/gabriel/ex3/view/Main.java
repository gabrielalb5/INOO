package com.gabriel.ex3.view;

import com.gabriel.ex3.model.ItemPedido;
import com.gabriel.ex3.model.Pedido;

public class Main {
    public static void main(String[] args) {
        ItemPedido item1 = new ItemPedido("Lápis", 5, 2.0);
        Pedido p1 = new Pedido(1, item1);

        System.out.println(p1);
    }
}
