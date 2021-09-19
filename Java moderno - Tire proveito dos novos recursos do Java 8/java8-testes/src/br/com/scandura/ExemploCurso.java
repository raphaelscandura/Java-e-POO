package br.com.scandura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Basket", 50));
        cursos.add(new Curso("Footbal", 550));
        cursos.add(new Curso("Tenis", 58));
        cursos.add(new Curso("Ballet", 5));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        // cursos.forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 51).forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 6).findAny().ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() < 100).collect(Collectors.toList())
                .forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getNome().length() > 5)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println("O curso de " + nome + " tem " + alunos + " alunos"));

    }
}

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public int getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
}