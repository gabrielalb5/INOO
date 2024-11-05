package view;

import model.Departamento;
import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Gabriel", 19);
        Funcionario f2 = new Funcionario("Bruno", 23);
        Funcionario f3 = new Funcionario("Vinicius", 21);
        Funcionario f4 = new Funcionario("Clodoaldo", 25);
        Funcionario f5 = new Funcionario("Graziela", 32);
        Funcionario f6 = new Funcionario("Marcos", 33);
        Funcionario f7 = new Funcionario("Thaisa", 33);

        Funcionario[] f_inteligencia = {f1,f3};
        Funcionario[] f_gente = {f4};
        Funcionario[] f_comercial = {f2};
        Funcionario[] f_financeiro = {f5,f6,f7};

        Departamento inteligencia = new Departamento("Inteligência de Mercado", f_inteligencia);
        Departamento gente = new Departamento("Gente e Gestão", f_gente);
        Departamento comercial = new Departamento("Comercial", f_comercial);
        Departamento financeiro = new Departamento("Financeiro", f_financeiro);

        inteligencia.listarFuncionarios();
        gente.listarFuncionarios();
        comercial.listarFuncionarios();
        financeiro.listarFuncionarios();
    }
}
