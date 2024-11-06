package model;

public class Banco {
    private static final double taxaJuros = 10.0;
    private static final double CDI = 11.20;

    public static double rendimentoCDB(double deposito){
        return deposito+deposito*(CDI/100);
    }

    public static double getTaxajuros() {
        return taxaJuros;
    }
}
