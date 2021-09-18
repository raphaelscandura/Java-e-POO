package br.com.scandura;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class TesteOrdenandoStrings {
    public static void main(String[] args) {
        List<String> frases = new ArrayList<>();

        frases.add("Zapdos is a really cool flying type pokemon");
        frases.add("Um milhão de vagalumes");
        frases.add("Arroz feijão batata e macarrão");

        // Collections.sort(frases, comparador);
        frases.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

        // for (String frase : frases) {
        // System.out.println(frase);
        // }

        frases.forEach(s -> System.out.println(s));
    }
}