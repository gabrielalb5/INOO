package ex8;
import java.util.Scanner;

public class Festas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] condominio = new int[7];

        for(int i=0;i<condominio.length;i++){
            System.out.print("Quantas festas a casa "+(i+1)+" realizou? ");
            condominio[i] = ler.nextInt();
        }

        int maiorQuantidadeFestas = 0;
        int casa = 0;
        double arrecadacao = 0;
        double taxa = 120;

        for(int i=0;i<condominio.length;i++){
            if(condominio[i]>maiorQuantidadeFestas){
                maiorQuantidadeFestas = condominio[i];
                casa = i;
            }
            arrecadacao += condominio[i]*taxa;
        }

        System.out.printf("\nA casa com maior quantidade de festas foi a número %d (%d festas)\nO condomínio arrecadou R$%.2f de taxa no último ano",casa+1,maiorQuantidadeFestas,arrecadacao);

        ler.close();
    }
}
