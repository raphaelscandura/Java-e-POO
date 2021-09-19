package br.com.scandura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Basket", 50));
        cursos.add(new Curso("Footbal", 550));
        cursos.add(new Curso("Tenis", 58));
        cursos.add(new Curso("Ballet", 5));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        //cursos.forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 51 ).forEach(c -> System.out.println(c.getNome()));
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