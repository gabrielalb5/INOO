package ex5;

public class Main {
    public static void main(String[] args) {
        Cidade c1 = new Cidade();
        Cidade c2 = new Cidade();
    
        c1.nome = "Araraquara";
        c2.nome = "São Carlos";

        c1.habitantes = 250000;
        c2.habitantes = 265000;

        c1.crescimento = 0.03;
        c2.crescimento = 0.02;

        int anos = 0;

        while(c1.habitantes<=c2.habitantes){
            c1.habitantes *= (1+c1.crescimento);
            c2.habitantes *= (1+c2.crescimento);
            anos++;
        };

        System.out.printf("São necessários %d anos para %s superar a população de %s\n",anos,c1.nome,c2.nome);
        System.out.printf(c1.nome+": %.0f habitantes\n",c1.habitantes);
        System.out.printf(c2.nome+": %.0f habitantes",c2.habitantes);
    }
    
}
