package com.gabriel.ex1.util;

import com.gabriel.ex1.model.Cliente;

public class Validador {
    
    public static boolean validarIdade(Cliente cliente){
        int idade = cliente.getIdade();
        if(idade>18)
            return true;
        else
            return false;
    }
}
