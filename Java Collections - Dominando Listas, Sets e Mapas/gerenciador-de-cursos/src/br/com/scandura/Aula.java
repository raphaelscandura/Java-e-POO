package br.com.scandura;

public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString(){
        return "\nTitulo da aula: " + this.titulo + "\nDuração da Aula: " + this.tempo + " minutos\n";
    }

    @Override
    public int compareTo(Aula outraAula){
        return this.titulo.compareTo(outraAula.titulo);
    }
}
