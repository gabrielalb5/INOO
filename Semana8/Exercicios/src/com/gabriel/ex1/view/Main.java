package com.gabriel.ex1.view;

import com.gabriel.ex1.model.Senha;
import com.gabriel.ex1.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Caio");
        Usuario u2 = new Usuario("Gabriel");
        Usuario u3 = new Usuario("Edilson");
        Senha s = new Senha(u, u2, u3, "");
        
        System.out.println(s.getSenha());
    }
}
