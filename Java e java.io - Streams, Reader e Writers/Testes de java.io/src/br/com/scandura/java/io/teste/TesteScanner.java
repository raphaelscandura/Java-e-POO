package br.com.scandura.java.io.teste;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;

public class TesteScanner{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            //String[] dados = linha.split(",");
            //System.out.println(dados[3]);

            Scanner linhaScanner = new Scanner(linha);
            //linhaScanner.useLocale(Locale.US); //Caso a máquina não esteja com a região configurada como Estados Unidos, usar isso para resolver a InputMismatchException do Double
            linhaScanner.useDelimiter(",");

            String tipoDeConta = linhaScanner.next();
            int numeroAgencia = linhaScanner.nextInt();
            int numeroConta = linhaScanner.nextInt();
            String nomeTitular = linhaScanner.next();
            double valorSaldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt","BR"),"%s - %04d-%d, %s: %.2f %n", tipoDeConta,numeroAgencia,numeroConta,nomeTitular,valorSaldo);

            linhaScanner.close();

        }
        
        scanner.close();
    }
}