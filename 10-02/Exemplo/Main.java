public class Main {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nome = "Gabriel Albino";
        a1.matricula = "AQ3002535";
        a1.nota1 = 10;
        a1.nota2 = 8;

        //double resultado = a1.calcularMedia();
        //System.out.println(resultado);

        System.out.println("A média é: " + a1.calcularMedia());

        Aluno a2 = new Aluno();
        a2.nome = "Caio";
    }
}