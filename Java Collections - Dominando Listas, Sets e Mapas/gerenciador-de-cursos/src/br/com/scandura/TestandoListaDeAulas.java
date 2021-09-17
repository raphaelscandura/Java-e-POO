package br.com.scandura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAulas {
    public static void main(String[] args) {
        
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(new Aula("Introdução e revisão", 20));
        aulas.add(new Aula("Entendendo conceitos", 15));
        aulas.add(new Aula("Aprofundando no tema", 19));

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
