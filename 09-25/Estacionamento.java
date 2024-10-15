import java.util.Scanner;
public class Estacionamento {
    public static void main(String[] args) {
        Double preco = 12.0;

        Scanner ler = new Scanner(System.in);

        System.out.println("CADASTRO DE VEÍCULO");
        System.out.print("Descrição do carro: ");
        String descricao = ler.nextLine();

        System.out.print("Placa: ");
        String placa = ler.nextLine();

        System.out.print("Horário de entrada (apenas hora): ");
        int entrada = ler.nextInt();

        System.out.print("Horário de saída (apenas hora): ");
        int saida = ler.nextInt();

        int permanencia = saida-entrada;

        if(permanencia>1){
            preco = preco+(permanencia-1)*preco/3;
        }

        if(preco<=20){
            preco *= 0.95;
        }else if(preco>20 && preco<=50){
            preco *= 0.9;
        }else{
            preco *= 0.80;
        }

        System.out.println("Seu veículo, "+descricao+" ("+placa+"), permaneceu por "+permanencia+"h no estacionamento ("+entrada+"h - "+saida+"h)\nValor a ser pago R$"+preco);

        ler.close();
    }
}
