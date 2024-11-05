package model;

public class Departamento {
    private String descricao;
    private Funcionario[] funcionarios;

    public Departamento(String descricao, Funcionario[] funcionarios){
        this.descricao = descricao;
        this.funcionarios = funcionarios;

        for(int i=0;i<funcionarios.length;i++){
            funcionarios[i].setDepartamento(this);
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void listarFuncionarios(){
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.getNome()+" ("+funcionario.getIdade()+") - Departamento: "+funcionario.getDepartamento().getDescricao());
        }
    }
}
