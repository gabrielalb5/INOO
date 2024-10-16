package ex6;

import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        int voto,c1=0,c2=0,c3=0,nulo=0,branco=0;

        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("URNA ELETRÔNICA");
            System.out.println("1, 2 ou 3 - Candidatos\n4 - Nulo\n5 - Branco");
            System.out.print("Digite seu voto: ");
            
            voto = ler.nextInt();

            switch (voto) {
                case 1: System.out.println("Registrando voto para o Candidato 1\n");
                    c1++;
                    break;
                case 2: System.out.println("Registrando voto para o Candidato 2\n");
                    c2++;
                    break;
                case 3: System.out.println("Registrando voto para o Candidato 3\n");
                    c3++;
                    break;
                case 4: System.out.println("Registrando voto nulo\n");
                    nulo++;
                    break;
                case 5: System.out.println("Registrando voto branco\n");
                    branco++;
                    break;
                case 0: System.out.println("Encerrando votação...");
                    break;
                default: System.out.println("Voto inválido!\n");
                    break;
            }
        }while(voto!=0);

        System.out.println("\nRESULTADO");
        System.out.println("Candidato 1: "+c1);
        System.out.println("Candidato 2: "+c2);
        System.out.println("Candidato 3: "+c3);
        System.out.println("Nulo: "+nulo);
        System.out.println("Branco: "+branco);

        ler.close();
    }
}
