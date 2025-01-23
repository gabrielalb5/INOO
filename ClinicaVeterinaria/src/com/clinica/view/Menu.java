package com.clinica.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.clinica.model.Cadastro;
import com.clinica.model.Login;
import com.clinica.model.Tutor;
import com.clinica.model.animais.Animal;
import com.clinica.model.colaboradores.Colaborador;
import com.clinica.model.colaboradores.Groomer;
import com.clinica.model.colaboradores.Veterinario;


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

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public void menuInicial(ArrayList<Colaborador> colaboradores){
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
                    menuColaborador(colaboradores);
                    break;
                case 0:
                    System.out.println("Saindo...");;
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
                    System.out.println("\nCADASTRO DE TUTOR");
                    Tutor novoTutor = lerTutor();
                    cadastro.cadastrarTutor(novoTutor);
                    System.out.println("Tutor cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLOGIN DE TUTOR");
                    clearBuffer(leitura);
                    System.out.print("CPF: ");
                    String cpf = leitura.nextLine();
                    System.out.print("Senha: ");
                    String senha = leitura.nextLine();
                    boolean saida = login.autenticar(cpf, senha, "TUTOR");
                    if(saida){
                        System.out.println("Login realizado com sucesso!");
                        //Exibir menu de quando estiver logado
                    }else{
                        System.out.println("Credenciais inválidas");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
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
        System.out.print("Confirme a senha: ");
        String confirmacao = leitura.nextLine();
        while(!senha.equals(confirmacao) || senha.length()<4){
            System.out.println("As senhas não são iguais ou tem menos de 4 caracteres!");
            System.out.print("Senha: ");
            senha = leitura.nextLine();
            System.out.print("Confirme a senha: ");
            confirmacao = leitura.nextLine();
        }
        Tutor t = new Tutor(nome, email, cpf, endereco, senha);
        return t;
    }

    public void menuColaborador(ArrayList<Colaborador> colaboradores){
        System.out.println("\nLOGIN DE COLABORADOR");
        clearBuffer(leitura);
        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        System.out.print("Senha: ");
        String senha = leitura.nextLine();
        boolean saida = login.autenticar(cpf, senha, "COLABORADOR");
        
        if(saida){
            System.out.println("Login realizado com sucesso!");
            for(Colaborador colaborador : colaboradores){
                if(colaborador.getCpf().equals(cpf)){
                    if (colaborador instanceof Groomer) {
                        menuGroomer((Groomer) colaborador);
                    } else if (colaborador instanceof Veterinario) {
                        menuVeterinario((Veterinario) colaborador);
                    }
                }
            }
        }else{
            System.out.println("Credenciais inválidas");
        }
    }

    public void menuGroomer(Groomer groomer){
        System.out.println("Olá, "+groomer.getNome());
        System.out.println("__________________________________");
        System.out.println("|                                 |");
        System.out.println("| > Groomer                       |");
        System.out.println("|                                 |");
        System.out.println("| 1. Ver pets para banho ou tosa  |");
        System.out.println("| 2. Atender próximo pet          |");
        System.out.println("| 3. Ver meu perfil               |");
        System.out.println("| 0. Sair                         |");
        System.out.println("|_________________________________|");
    }

    public void menuVeterinario(Veterinario veterinario){
        System.out.println("Olá, "+veterinario.getNome());
        System.out.println("__________________________________");
        System.out.println("|                                 |");
        System.out.println("| > Veterinário                   |");
        System.out.println("|                                 |");
        System.out.println("| 1. Ver lista de espera          |");
        System.out.println("| 2. Tratar próximo pet           |");
        System.out.println("| 3. Ver meu perfil               |");
        System.out.println("| 0. Sair                         |");
        System.out.println("|_________________________________|");
    }
}