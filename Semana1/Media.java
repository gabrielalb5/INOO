import java.util.Scanner;
class Media {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double n1;
        double n2;
        System.out.print("Informe a nota 1: ");
        n1 = ler.nextDouble();

        System.out.print("Informe a nota 2: ");
        n2 = ler.nextDouble();

        double media = (n1*1+n2*2)/3;
        System.out.printf("A média das notas é %.2f", media);

        ler.close();
    }
}