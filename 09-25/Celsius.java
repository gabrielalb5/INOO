import java.util.Scanner;
class Celsius {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double fahrenheit;
        System.out.print("Informe a temperatura em Fahrenheit: ");
        fahrenheit = ler.nextDouble();

        double celsius = (fahrenheit-32)/1.8;
        System.out.printf("%6.2f em fahrenheit correspondem a %6.2f°C",fahrenheit,celsius);

        ler.close();
    }
}