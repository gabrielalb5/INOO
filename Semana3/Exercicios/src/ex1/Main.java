package ex1;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        Filme f2 = new Filme();
        Filme f3 = new Filme();

        f1.titulo = "Boyhood";
        f1.ano = 2014;
        f1.valor = 4;

        f2.titulo = "O Segredo de Brokeback Mountain";
        f2.ano = 2005;
        f2.valor = 14;

        f3.titulo = "Pobres Criaturas";
        f3.ano = 2023;
        f3.valor = 35;

        Filme[] filmes = {f1,f2,f3};

        for(int i=0;i<3;i++){
            System.out.println(filmes[i].titulo+" ("+filmes[i].ano+") custou US$ "+filmes[i].valor+" milhões para ser produzido");
        }

    }
}
