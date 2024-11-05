package model;

public class Cliente {
    private String nome;
    private String endereco;
    private Pedido pedido;

    public Cliente(String nome, String endereco, Pedido pedido){
        this.nome = nome;
        this.endereco = endereco;
        this.pedido = pedido;
    }

    public void exibirPedido(){
        System.out.println(nome+", seu pedido \""+pedido.getProduto()+"\" de R$ "+pedido.getPreco()+" será entregue no dia "+pedido.getData()+" em seu endereço "+endereco);
    }
}
