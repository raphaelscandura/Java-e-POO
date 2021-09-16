package br.com.scandura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("lorem6.txt");

        ps.println("Olá Mundo!");
        ps.println();
        ps.println("Meu nome é Raphael Scandura!");

        ps.close();
    }
    
}
