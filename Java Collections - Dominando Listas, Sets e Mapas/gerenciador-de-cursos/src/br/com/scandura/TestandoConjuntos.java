package br.com.scandura;

import java.util.HashSet;
import java.util.Set;

public class TestandoConjuntos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Neo Juaske");
        alunos.add("David DeByran");
        alunos.add("Jason Gray");
        alunos.add("Red Hoodson");
        alunos.add("Prince Adjahni");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Tamanho do conjunto: " + alunos.size());
        boolean raphaelEstaMatriculado = alunos.contains("Raphael Scandura");
        System.out.println(raphaelEstaMatriculado);

        alunos.remove("Neo Juaske");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Tamanho do conjunto: " + alunos.size());
    }
}
