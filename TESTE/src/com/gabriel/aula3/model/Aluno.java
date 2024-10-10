package TESTE.src.com.gabriel.aula3.model;

public class Aluno {
    public String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        if(idade>0){
            this.idade = idade;
        }else{
            System.out.println("A idade não pode ser negativa!");
        }
    }
}