package com.gabriel.ex2.model;

public class AssinaturaMensal extends Assinatura{

    public AssinaturaMensal(String assinante, String descricao, String data, boolean anual, boolean ativa, double preco){
        super(assinante, descricao, data, anual, ativa, preco);
    }

    @Override
    public void renovarAssinatura(){
        System.out.println(super.getAssinante()+", sua assinatura mensal de '"+super.getDescricao()+"' foi renovada");
        System.out.println("R$"+calcularTotalPago()+" debitado do seu cartão.");
        setAtiva(true);
    }

    @Override
    public void cancelarAssinatura(String dataCancelamento){
        System.out.println("Assinatura de cancelada. Obrigado pelo tempo conosco!");
        setAtiva(false);
    }

    @Override 
    public double calcularTotalPago(){
        return super.getPreco();
    }

    @Override
    public void detalhesAssinatura() {
        if(super.isAtiva()){
            System.out.println(super.getAssinante()+" assina `"+super.getDescricao()+"` R$"+super.getPreco()+" (Assina desde "+super.getData()+") - está ativa");
        }else{
            System.out.println(super.getAssinante()+" assinou `"+super.getDescricao()+"` R$"+super.getPreco()+" (Começou em "+super.getData()+") - foi cancelada");
        }
    }
}
