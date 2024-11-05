package model;

public class Funcionario {
    private String nome;
    private int idade;
    private Departamento departamento;

    public Funcionario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
}
