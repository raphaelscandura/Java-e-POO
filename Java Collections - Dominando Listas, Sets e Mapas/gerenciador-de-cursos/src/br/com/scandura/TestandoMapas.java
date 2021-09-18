package br.com.scandura;

public class TestandoMapas {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Raphael Scandura");

        javaColecoes.adiciona(new Aula("Introdução ao java", 38));
        javaColecoes.adiciona(new Aula("Entendendo conceitos básicos", 18));
        javaColecoes.adiciona(new Aula("Se aprofundando no conteúdo", 28));

        javaColecoes.matricular(new Aluno("Squawk Aways", 0001));
        javaColecoes.matricular(new Aluno("West Turtle", 0002));
        javaColecoes.matricular(new Aluno("Ayuwo Kip", 0003));
        javaColecoes.matricular(new Aluno("Silent Kasuky", 0004));

        System.out.println("Quem é o aluno com número de matrícula 0002?\n");
        Aluno aluno = javaColecoes.buscaMatricula(0002);
        System.out.println(aluno);
    }
}
