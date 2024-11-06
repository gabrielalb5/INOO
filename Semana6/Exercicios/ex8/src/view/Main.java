package view;

import model.Banco;

public class Main {
    public static void main(String[] args) {
        double deposito = 7000.00;
        double rendimento = Banco.rendimentoCDB(deposito);
        System.out.println("Total R$"+rendimento);
        System.out.println("Seu depósito de R$"+deposito+" rendeu "+(rendimento-deposito));
        System.out.println("A taxa de "+Banco.getTaxajuros()+"% implicou em um desconto de "+((rendimento-deposito)*(Banco.getTaxajuros()/100)));
    }
}
