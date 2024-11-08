package com.gabriel.ex5.model;

public class Cliente {
    private String nome;
    private String cpf;
    private double saldo;
    private Ingresso[] ingressos = new Ingresso[10];
    private int quantidadeIngressos = 0;

    public Cliente(String nome, String cpf, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void depositar(double credito){
        if(credito>0){
            saldo = saldo+credito;
            System.out.println(getNome()+" foi creditado em R$"+credito);
        }else
            System.out.println("Valor inválido");
    }

    public void comprarIngresso(Ingresso ingresso){
        if(ingresso.getPreco()>saldo){
            System.out.println(getNome()+" não tem dinheiro pra ir no show \""+ingresso.getShow()+"\"");
        }else if(quantidadeIngressos<ingressos.length){
            ingressos[quantidadeIngressos] = ingresso;
            quantidadeIngressos++;
            System.out.println(getNome()+" comprou ingresso para assistir \""+ingresso.getShow()+"\"");
            saldo = saldo-ingresso.getPreco();
        }
    }

    public void listarIngressos(){
        if(quantidadeIngressos==0)
            System.out.println(getNome()+" não possui nenhum ingresso");
        else{
            System.out.println("\nIngressos de "+getNome());
            for(int i=0;i<quantidadeIngressos;i++) {
                
                System.out.println("| "+ingressos[i].getShow());
                if(ingressos[i].getPreco()==0)
                    System.out.println("| Gratuito");
                else
                    System.out.println("| R$ "+ingressos[i].getPreco());
                System.out.println("| Local: "+ingressos[i].getLocal());
                System.out.println("| Data e hora: "+ingressos[i].getData()+" às "+ingressos[i].getHorario());
                System.out.println("------------------------------");
            }
            System.out.print("\n");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

}
