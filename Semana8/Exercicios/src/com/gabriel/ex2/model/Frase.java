package com.gabriel.ex2.model;

public class Frase {
    private String str;

    public Frase(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public static void Contagem(Frase frase){
        String str = frase.str;
        int tamanho = str.length();
        str = str.toUpperCase();
        int cont = 0;
        for(int i=0;i<tamanho;i++){
            switch (str.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                        cont++;
                        break;
            }
        }
        System.out.println("A string contém "+cont+" vogais");
    }
}
