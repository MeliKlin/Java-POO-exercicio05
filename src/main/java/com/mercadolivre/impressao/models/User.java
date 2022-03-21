package com.mercadolivre.impressao.models;

import java.util.List;

public class User {

    private String nome;
    private String sobrenome;
    private int idade;
    private List<String> habilidades;

    public User(String nome, String sobrenome, int idade, List<String> habilidades) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.habilidades = habilidades;
    }

}
