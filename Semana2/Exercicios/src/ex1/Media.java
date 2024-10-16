package ex1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double media;
    
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        double nota1 = ler.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = ler.nextDouble();
    
        media = (nota1+nota2)/2;

        System.out.printf("Sua média é de %.2f\n",media);
        if(media<6){
            System.out.print("Você foi reprovado");
        }else{
            System.out.print("Você foi aprovado");
        }
    
        ler.close(); 
    }

}
