import java.util.Scanner;
class Fatorial {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int num;
        System.out.print("Digite um número: ");
        num = ler.nextInt();

        int fatorial = 1;
        for(int i=num; i>0; i--){
            fatorial *= i;
        }

        System.out.printf("%d! é igual a %d",num,fatorial);

        ler.close();
    }
}