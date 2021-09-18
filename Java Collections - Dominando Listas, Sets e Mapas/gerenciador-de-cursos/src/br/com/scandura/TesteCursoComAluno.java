package br.com.scandura;

public class TesteCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Raphael Scandura");

        javaColecoes.adiciona(new Aula("Introdução ao java", 38));
        javaColecoes.adiciona(new Aula("Entendendo conceitos básicos", 18));
        javaColecoes.adiciona(new Aula("Se aprofundando no conteúdo", 28));

        javaColecoes.matricular(new Aluno("Squawk Aways", 0001));
        javaColecoes.matricular(new Aluno("West Turtle", 0002));
        javaColecoes.matricular(new Aluno("Ayuwo Kip", 0003));
        javaColecoes.matricular(new Aluno("Silent Kasuky", 0004)); 

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {System.out.println(a);});

        Aluno teste1 = new Aluno("Utkan Mehpravar", 0004);

        Aluno teste2 = new Aluno("Utkan Mehpravar", 0004);

        System.out.println(teste1.equals(teste2));

        //Sempre mudar o hashCode() quando mudar o equals()
        
    }

}
