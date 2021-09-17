package br.com.scandura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Raphael Scandura");
        javaColecoes.adiciona(new Aula("Introdução ao java", 38));
        javaColecoes.adiciona(new Aula("Entendendo conceitos básicos", 18));
        javaColecoes.adiciona(new Aula("Se aprofundando no conteúdo", 28));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println("Tempo total do curso: " + javaColecoes.getTempoTotal() + " minutos");
        
    }
    
}
