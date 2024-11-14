package com.gabriel.ex1.model;

public class Senha {
    private String senha = "";

    public Senha(Usuario u1, Usuario u2, Usuario u3, String senha){
        senha = firstLast(u1);
        senha = senha.concat(firstHalf(u2));
        senha = senha.concat(oddCharacters(u3));
        this.senha = senha;
    }

    public String firstLast(Usuario u){
        String nome = u.getNome();
        int tamanho = nome.length();
        String first = nome.substring(0,1);
        String last = nome.substring(tamanho-1);
        return first+last;
    }

    public String firstHalf(Usuario u){
        String nome = u.getNome();
        double tamanho = nome.length();
        int tam; 
        if(tamanho%2==0){
            tam = (int)tamanho;
        }else{
            tamanho++;
            tam = (int)tamanho;
        }
        nome = nome.substring(0,tam/2);

        return nome;
    }

    public String oddCharacters(Usuario u){
        String nome = u.getNome();
        double tamanho = nome.length();
        String senha = "";

        for(int i=1;i<=tamanho;i++){
            if(i%2!=0){
                char c = nome.charAt(i-1);
                senha = senha.concat(""+c);
            }
        }
        senha = senha.toUpperCase();
        return senha;
    }

    public String getSenha() {
        return senha;
    }
}


