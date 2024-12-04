package com.gabriel.ex3.model;

import java.util.ArrayList;

public class Pedido{
    private int id;
    private double total = 0;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Pedido(int id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
        total += p.getPreco();
        System.out.println("\'"+p.getDescricao()+"\' adicionado ao pedido "+getId());
        System.out.println("Subtotal: R$"+total);
    }

    public void exibirProdutos(){
        System.out.println();
        System.out.println("Itens do pedido #"+getId());
        for(Produto produto : produtos){
            System.out.println("| "+produto.getDescricao()+" R$"+produto.getPreco());
        }
        System.out.println("O Subtotal: R$"+total);
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
