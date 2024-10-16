package ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Conta Inter = new Conta();
        Conta Caixa = new Conta();

        Inter.cliente = "Gabriel Albino";
        Inter.tipo = 2;
        Inter.saldo = 5000;

        Caixa.cliente = "Gabriel Albino";
        Caixa.tipo = 1;
        Caixa.saldo = 150;

        System.out.println("Qual banco deseja acessar?\n1 - Inter\n2 - Caixa");
        int banco = ler.nextInt();

        Conta contaSelecionada = (banco == 1) ? Inter : Caixa;

        int opcao;
        do{
            System.out.printf("\nSaldo atual: R$%.2f\n", contaSelecionada.saldo);
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Calcular Bônus");
            System.out.println("4 - Calcular Tarifa");
            System.out.println("0 - Sair");
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = ler.nextDouble();
                    contaSelecionada.saque(valorSaque);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = ler.nextDouble();
                    contaSelecionada.deposito(valorDeposito);
                    break;
                case 3:
                    double bonus = contaSelecionada.calcularBonus();
                    System.out.printf("Bônus: R$%.2f\n", bonus);
                    break;
                case 4:
                    double tarifa = contaSelecionada.calcularTarifa();
                    System.out.printf("Tarifa: R$%.2f\n", tarifa);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(opcao!=0);

        ler.close();
    }
}
