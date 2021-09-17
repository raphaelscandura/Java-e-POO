package br.com.scandura;

public class TestandoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Raphael Scandura");
        javaColecoes.adiciona(new Aula("Introdução ao java", 8));

        System.out.println(javaColecoes.getAulas());
    }
    
}
