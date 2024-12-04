package com.gabriel.ex2.view;

import com.gabriel.ex2.model.Musica;
import com.gabriel.ex2.model.Playlist;

public class Main {
    public static void main(String[] args) {
        //Chromakopia
        Musica m1 = new Musica("St. Chroma", "R&B", "Tyler, the Creator", "3:17");
        Musica m2 = new Musica("Rah Tah Tah", "Hip Hop", "Tyler, the Creator", "2:45");
        Musica m3 = new Musica("Noid", "Electronic", "Tyler, the Creator", "4:44");
        Musica m4 = new Musica("Sticky", "Hip Hop", "Tyler, the Creator", "4:15");
        Musica m5 = new Musica("Like Him", "Soul", "Tyler, the Creator", "4:38");
        //Wicked
        Musica m6 = new Musica("No One Mourns the Wicked", "Soundtrack", "Ariana Grande featuring Andy Nyman, Courtney-Mae Briggs, Jeff Goldblum, Sharon D. Clarke, and Jenna Boyd", "7:27");
        Musica m7 = new Musica("The Wizard and I", "Soundtrack", "Cynthia Erivo featuring Michelle Yeoh", "5:36");
        Musica m8 = new Musica("What Is This Feeling?", "Soundtrack", "Ariana Grande and Cynthia Erivo", "3:48");
        Musica m9 = new Musica("Popular", "Soundtrack", "Ariana Grande", "4:01");
        Musica m10 = new Musica("Defying Gravity", "Soundtrack", "Cynthia Erivo featuring Ariana Grande", "7:39");
        //Hamilton
        Musica m11 = new Musica("Satisfied","Show tune","Renee Elise Goldsberry, Original Broadway Cast of Hamilton","5:29");

        Playlist chromakopia = new Playlist("Chromakopia");
        chromakopia.adicionarMusica(m1);
        chromakopia.adicionarMusica(m2);
        chromakopia.adicionarMusica(m3);
        chromakopia.adicionarMusica(m4);
        chromakopia.adicionarMusica(m5);

        Playlist wicked = new Playlist("Wicked Soundtrack");
        wicked.adicionarMusica(m6);
        wicked.adicionarMusica(m7);
        wicked.adicionarMusica(m8);
        wicked.adicionarMusica(m9);
        wicked.adicionarMusica(m10);
        wicked.adicionarMusica(m11);

        wicked.retornaPosicao(m11);
        wicked.removerMusica(5);
        wicked.retornaPosicao(m11);
        wicked.quantidadeMusicas();
        chromakopia.quantidadeMusicas();
    }
}
