package com.gabriel.ex3.model;

public class Pedido {
    private int numeroPedido;
    private ItemPedido itens;

    public Pedido(int numeroPedido, ItemPedido itens){
        this.numeroPedido = numeroPedido;
        this.itens = itens;
    }
    
    @Override
    public String toString(){
        return "Pedido[Numero="+numeroPedido+", Itens=[ItemPedido[nomeProduto="+itens.getNomeProduto()+", quantidade="+itens.getQuantidade()+", precoUnitario="+itens.getPrecoUnitario()+"]]]";
    }
}
