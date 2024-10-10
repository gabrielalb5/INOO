package com.gabriel.academico.view;

import com.gabriel.academico.model.Aluno;

public class TesteAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.setNome("Gabriel");
        a1.setIdade(19);
        
        Aluno a2 = new Aluno();
        a2.setNome("José");
        a2.setIdade(-25);
        
        System.out.println("Nome do aluno: " + a1.getNome() + "\nIdade: " + a1.getIdade());
        System.out.println("Nome do aluno: " + a2.getNome() + "\nIdade: " + a2.getIdade());
    }
}