package br.com.scandura;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula){
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo");
        }
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

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object o){
        Aluno outro = (Aluno) o;
        if(this.nome == outro.nome && this.numeroMatricula == outro.numeroMatricula){
            return true;
        }
        return false;
    }
}
