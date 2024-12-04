package com.gabriel.ex3.view;

import com.gabriel.ex3.model.Cliente;
import com.gabriel.ex3.model.Pedido;
import com.gabriel.ex3.model.Produto;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gabriel", "Av cinco de maio, 505");
        Cliente c2 = new Cliente("Caio", "Av sete de março, 703");

        Produto p1 = new Produto("Arroz", 35.00);
        Produto p2 = new Produto("Feijão", 8.00);
        Produto p3 = new Produto("Sabão em Pó", 12.50);
        Produto p4 = new Produto("Óleo de Soja", 7.80);
        Produto p5 = new Produto("Leite", 4.50);
        Produto p6 = new Produto("Banana", 3.50);

        Pedido ped1 = new Pedido(1,c1);
        Pedido ped2 = new Pedido(2,c2);

        ped1.adicionarProduto(p1);
        ped1.adicionarProduto(p2);
        ped1.adicionarProduto(p5);
        ped1.adicionarProduto(p5);
        ped1.adicionarProduto(p5);
        ped1.adicionarProduto(p6);

        ped2.adicionarProduto(p3);
        ped2.adicionarProduto(p4);
        ped2.adicionarProduto(p5);

        ped1.exibirProdutos();
        ped2.exibirProdutos();
    }
}
