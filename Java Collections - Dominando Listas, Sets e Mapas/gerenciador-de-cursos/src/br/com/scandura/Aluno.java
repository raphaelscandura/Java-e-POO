package br.com.scandura;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula){
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %04d %s", "Nome: ",  this.getNome(), "\nMatricula: ", this.getNumeroMatricula(), "\n");
    }
}
