package com.gabriel.ex2.model;

import java.util.ArrayList;

public class Playlist {
    private String titulo;
    private ArrayList<Musica> musicas = new ArrayList<>();

    public Playlist(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
        System.out.println("A música \'"+musica.getNome()+"\' foi adicionado ao álbum \'"+getTitulo()+"\'");
    }

    public void removerMusica(int posicao){
        Musica musica = musicas.get(posicao);
        musicas.remove(posicao);
        System.out.println("A música \'"+musica.getNome()+"\' foi removida do álbum \'"+getTitulo()+"\'");
    }

    public void retornaPosicao(Musica musica){
        int posicao = musicas.indexOf(musica);
        if(posicao>=0){
            System.out.println("A música \'"+musica.getNome()+"\' está na posição "+(posicao+1)+" da playlist \'"+getTitulo()+"\'");
        }else{
            System.out.println("A música \'"+musica.getNome()+"\' não foi encontrada na playlist \'"+getTitulo()+"\'");
        }
    }
    
    public int quantidadeMusicas(){
        int qtd = musicas.size();
        if(qtd>0){
            System.out.println("A playlist \'"+getTitulo()+"\' tem "+qtd+" músicas");
        }else{
            System.out.println("A playlist \'"+getTitulo()+"\'está vazia");
        }
        return qtd;
    }
}
