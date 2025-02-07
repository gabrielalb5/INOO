package com.gabriel.ex2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AssinaturaAnual extends Assinatura{
    public int desconto = 10;
    public int multa = 30;

    public AssinaturaAnual(String assinante, String descricao, String data, boolean anual, boolean ativa, double preco){
        super(assinante, descricao, data, true, ativa, preco);
    }

    @Override
    public void renovarAssinatura(){
        System.out.println(super.getAssinante()+", sua assinatura anual de '"+super.getDescricao()+"' foi renovada");
        System.out.println("R$"+calcularTotalPago()+" debitado do seu cartão.");
        setAtiva(true);
    }

    @Override
    public void cancelarAssinatura(String dataCancelamento){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCancelamentoFormatada = LocalDate.parse(dataCancelamento, formato);
        LocalDate dataAssinaturaFormatada = LocalDate.parse(getData(), formato);
        LocalDate minimoSemMulta = dataAssinaturaFormatada.plusDays(365);

        System.out.println(super.getAssinante()+", assinatura de cancelada. Obrigado pelo tempo conosco!");
        if(dataCancelamentoFormatada.isBefore(minimoSemMulta)){
            double precoMulta = super.getPreco()*((getMulta()/100.0));
            System.out.println(super.getAssinante()+", você recebeu uma multa de R$"+precoMulta);
        }
        setAtiva(false);
    }

    @Override 
    public double calcularTotalPago(){
        return super.getPreco()*(1-desconto/100);
    }

    @Override
    public void detalhesAssinatura() {
        if(super.isAtiva()){
            System.out.println(super.getAssinante()+" assina `"+super.getDescricao()+"` R$"+super.getPreco()+" -"+getDesconto()+"% desconto (Assina desde "+super.getData()+") - está ativa");
        }else{
            System.out.println(super.getAssinante()+" assinou `"+super.getDescricao()+"` R$"+super.getPreco()+" (Começou em "+super.getData()+") - foi cancelada");
        }
    }

    public int getMulta() {
        return multa;
    }

    public int getDesconto() {
        return desconto;
    }
}
