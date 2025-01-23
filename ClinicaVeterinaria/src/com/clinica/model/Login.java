package com.clinica.model;

import java.util.ArrayList;

import com.clinica.model.colaboradores.Colaborador;

public class Login {
    private ArrayList<Tutor> tutores;
    private ArrayList<Colaborador> colaboradores;

    public Login(ArrayList<Tutor> tutores, ArrayList<Colaborador> colaboradores){
        this.tutores = tutores;
        this.colaboradores = colaboradores;
    }

    public boolean autenticar(String cpf, String senha, String perfil){
        boolean exists = false;
        if(perfil.equals("COLABORADOR")){
            for(Colaborador c : colaboradores){
                if(c.getCpf().equals(cpf)){
                    if(c.getSenha().equals(senha)){
                        exists = true;
                    }
                }
            }
        }else if(perfil.equals("TUTOR")){
            for(Tutor t : tutores){
                if(t.getCpf().equals(cpf)){
                    if(t.getSenha().equals(senha)){
                        exists = true;
                    }
                }
            }
        }
        return exists;
    }
}
