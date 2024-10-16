package ex4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        Produto[] produtos = {p1,p2,p3};

        for(int i = 0; i < 3; i++){
            produtos[i].codigo = i+1;
        }

        p1.produto = "café";
        p2.produto = "capuccino";
        p3.produto = "chocolate";

        p1.valor = 5.0;
        p2.valor = 9.5;
        p3.valor = 10.2;

        System.out.print("Buscar produto por código: ");
        int busca = ler.nextInt();

        boolean flag = false;
        for (Produto produto : produtos) {
            if (produto.codigo == busca) {
                System.out.printf("Produto encontrado: %s - Valor: R$%.2f",produto.produto,produto.valor);
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("Produto não cadastrado!");
        }

        ler.close();
    }
}
