package ex1;
import java.util.Scanner;

public class Usina {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantidade de cana de açúcar estimada para processamento (em toneladas): ");
        double quantidadeEstimada = ler.nextDouble();

        System.out.print("Quantidade realmente processada (em toneladas): ");
        double quantidadeProcessada = ler.nextDouble();

        System.out.print("Custo de produção: R$");
        double custoProducao = ler.nextDouble();

        System.out.print("Preço de venda da tonelada: R$");
        double precoVenda = ler.nextDouble();

        double receitaTotal = quantidadeProcessada*precoVenda;
        double custoTotal = quantidadeProcessada*custoProducao;
        double lucro = receitaTotal-custoTotal;

        double capacidadeUtilizada = (quantidadeProcessada/quantidadeEstimada)*100;

        System.out.println("\nRELATÓRIO DA USINA");
        System.out.println("Toneladas processadas: "+quantidadeProcessada+"t");
        System.out.println("Valor da tonelada: R$"+precoVenda);
        System.out.println("Lucro: R$"+lucro);
        System.out.println("Capacidade de produção utilizada: "+capacidadeUtilizada+"%");

        ler.close();
    }
}
