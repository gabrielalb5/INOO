package ex7;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] temperaturas = new double[12];

        for(int i=0;i<temperaturas.length;i++){
            System.out.print("Digite a temperatura média do mês "+(i+1)+": ");
            temperaturas[i] = ler.nextDouble();
        }

        double maiorTemp = -100;
        int mes = 0;
        double ano = 0;

        for(int i=0;i<temperaturas.length;i++){
            if(i==0){
                maiorTemp = temperaturas[i];
                mes = i;
            }else if(temperaturas[i]>maiorTemp){
                maiorTemp = temperaturas[i];
                mes = i;
            }
            ano += temperaturas[i];
        }
        
        ano = ano/12;

        System.out.printf("\nA maior temperatura foi de %.2f°C no mês %d\nA média anual foi de %.2f°C",maiorTemp,mes+1,ano);

        ler.close();
    }
}
