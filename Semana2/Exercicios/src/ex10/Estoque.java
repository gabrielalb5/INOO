package ex10;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[][] produtos = new double[5][2];
        int i, j;

        for(i=0;i<5;i++){
            for(j=0;j<2;j++){
                if(j==0){
                    System.out.print("Digite a quantidade do produto "+(i+1)+": ");
                    produtos[i][j] = ler.nextDouble();
                }else{
                    System.out.print("Valor do produto "+(i+1)+": R$ ");
                    produtos[i][j] = ler.nextDouble();
                }
            }
        }

        int indiceMaisCaro = 0;
        double maisCaro = 0;
        int quantidadeArmazenada = 0;
        double valorTotal = 0;

        System.out.print("\nPRODUTO   ESTOQUE   VALOR");
        for(i=0;i<5;i++){
            //ID DO PRODUTO
            System.out.print("\nProduto "+(i+1));
            for(j=0;j<2;j++){
                if(j==0){
                    //QUANTIDADES
                    System.out.printf(" |  %.0f",produtos[i][j]);
                    quantidadeArmazenada += produtos[i][j];
                    valorTotal += produtos[i][j]*produtos[i][j+1];
                }else{
                    //VALORES
                    System.out.print("  | R$ "+produtos[i][j]);
                    if(produtos[i][j]>maisCaro){
                        maisCaro = produtos[i][j];
                        indiceMaisCaro = i;
                    }
                }
            }
        }

        System.out.printf("\n\nO produto mais caro é o %d (R$%.2f)\n",indiceMaisCaro+1,maisCaro);
        System.out.println("O estoque contém "+quantidadeArmazenada+" itens");
        System.out.printf("O valor total do estoque é de R$%.2f\n",valorTotal);

        ler.close();
    }
}
