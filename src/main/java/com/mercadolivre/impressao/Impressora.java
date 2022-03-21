package com.mercadolivre.impressao;

import com.mercadolivre.impressao.models.User;

import java.util.ArrayList;

public class Impressora {

    public void imprimirCurriculo() {
        ArrayList<String> habilidades = new ArrayList<>();
        habilidades.add("Cozinhar");
        habilidades.add("Desenhar");
        User user = new User("John", "Doe", 20, habilidades);

        System.out.println("Imprimindo curriculo");
        System.out.println(user);
        System.out.println();
    }

    public void imprimirPdf() {
        System.out.println("Imprimindo PDF");
    }

    public void imprimirRelatorio() {
        System.out.println("Imprimindo Relatorio");
    }

}
