package br.com.scandura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));

        bw.write("Olá Mundo!");
        bw.newLine();
        bw.write("Meu nome é Raphael Scandura!");

        bw.close();
    }
    
}
