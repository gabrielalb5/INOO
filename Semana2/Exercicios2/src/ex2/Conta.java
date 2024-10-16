package ex2;

class Conta {
    String cliente;
    int tipo;
    double saldo;

    public void saque(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void deposito(double valor) {
        if(valor>0){
            saldo += valor;
            System.out.println("Depósito de R$"+valor+" realizado com sucesso.");
        }else{
            System.out.println("Valor inválido para depósito.");
        }
    }

    public double calcularBonus() {
        if(saldo<=1000){
            return saldo*0.05;
        }else{
            return saldo*0.1;
        }
    }

    public double calcularTarifa() {
        if(tipo == 1) {
            return 25;
        }else{
            return 90;
        }
    }
}