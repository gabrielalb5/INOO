package model;

public class Pedido {
    private String produto;
    private double preco;
    private String data;

    public Pedido(String produto, double preco, String data){
        this.produto = produto;
        this.preco = preco;
        this.data = data;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public String getData() {
        return data;
    }
}
