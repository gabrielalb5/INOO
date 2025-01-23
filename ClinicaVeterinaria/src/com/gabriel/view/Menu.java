package com.gabriel.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.gabriel.model.Cadastro;
import com.gabriel.model.Login;
import com.gabriel.model.Tutor;
import com.gabriel.model.animais.Animal;
import com.gabriel.model.colaboradores.Colaborador;

public class Menu {
    // ArrayList<Tutor> tutores;
    // ArrayList<Animal> animais;
    // ArrayList<Colaborador> colaboradores;
    Cadastro cadastro;
    Login login;
    Scanner leitura;

    public Menu(ArrayList<Tutor> tutores, ArrayList<Animal> animais, ArrayList<Colaborador> colaboradores){
        // this.tutores = tutores;
        // this.colaboradores = colaboradores;
        // this.animais = animais;
        this.cadastro = new Cadastro(tutores, colaboradores, animais);
        this.login = new Login(tutores, colaboradores);
        this.leitura = new Scanner(System.in);
    }

    public void menuInicial(){
        int opcao;
        do{
            System.out.println("__________________________________");
            System.out.println("|                                 |");
            System.out.println("| Bem-vindo à clínica Pet Repete! |");
            System.out.println("|                                 |");
            System.out.println("| Como deseja acessar?            |");
            System.out.println("|                                 |");
            System.out.println("| 1. Sou tutor de pet             |");
            System.out.println("| 2. Sou colaborador              |");
            System.out.println("| 0. Sair                         |");
            System.out.println("|_________________________________|");
            System.out.print("\n> Escolha uma opção: ");

            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    menuTutor();
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao!=0);
    }

    public void menuTutor(){
        int opcao;

        do{
            System.out.println("________________________");
            System.out.println("|                       |");
            System.out.println("| > Tutor de Pet        |");
            System.out.println("|                       |");
            System.out.println("| 1. Realizar cadastro  |");
            System.out.println("| 2. Realizar login     |");
            System.out.println("| 0. Voltar             |");
            System.out.println("|_______________________|");
            System.out.print("\n> Escolha uma opção: ");

            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    Tutor novoTutor = lerTutor();
                    cadastro.cadastrarTutor(novoTutor);
                    break;
                case 2:
                    clearBuffer(leitura);
                    System.out.print("CPF: ");
                    String cpf = leitura.nextLine();
                    System.out.print("Senha: ");
                    String senha = leitura.nextLine();
                    boolean saida = login.autenticar(cpf, senha, "TUTOR");
                    System.out.println(saida? "Login relizado com sucesso!" : "Credenciais inválidas");
                    break;
                default:
                    break;
            }
        }while (opcao!=0);
    }

    private Tutor lerTutor(){
        clearBuffer(leitura);
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Email: ");
        String email = leitura.nextLine();
        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        System.out.print("Endereço: ");
        String endereco = leitura.nextLine();
        System.out.print("Senha: ");
        String senha = leitura.nextLine();
        Tutor t = new Tutor(nome, email, cpf, endereco, senha);
        return t;
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
