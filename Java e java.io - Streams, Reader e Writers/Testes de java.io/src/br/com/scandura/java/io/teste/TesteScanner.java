package br.com.scandura.java.io.teste;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TesteScanner{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
        
        scanner.close();
    }
}