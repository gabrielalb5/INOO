package ex2;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Qual o salário? R$");
        double salario = ler.nextInt();

        if(salario<=1500){
            salario *= 1.2;
            System.out.println("Aumento de 20%");
        }else{
            salario *= 1.1;
            System.out.println("Aumento de 10%");
        }

        System.out.printf("Novo salário: R$%.2f",salario);

        ler.close();
    }
}
