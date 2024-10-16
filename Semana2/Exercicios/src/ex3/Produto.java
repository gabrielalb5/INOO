package ex3;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Qual o preço do produto? R$");
        double preco = ler.nextDouble();

        if(preco<=50){
            preco *= 1.1;
            System.out.println("Aumento de 10%");
        }else if(preco>50 && preco<=100){
            preco *= 1.2;
            System.out.println("Aumento de 20%");
        }else{
            preco *= 1.3;
            System.out.println("Aumento de 30%");
        }

        System.out.printf("Novo preço: R$%.2f\n",preco);

        if(preco<=80){
            System.out.println("Classificação do preço: Barato");
        }else if(preco>80 && preco<=120){
            System.out.println("Classificação do preço: Normal");
        }else if(preco>120 && preco<=200){
            System.out.println("Classificação do preço: Caro");
        }else{
            System.out.println("Classificação do preço: Muito Caro");
        }


        ler.close();
    }
}
