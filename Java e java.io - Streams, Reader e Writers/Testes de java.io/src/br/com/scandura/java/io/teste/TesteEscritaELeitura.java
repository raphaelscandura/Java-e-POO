package br.com.scandura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.InputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.OutputStream;

public class TesteEscritaELeitura {
    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Olá Mundo!");
        bw.newLine();
        bw.write("Meu nome é Raphael Scandura!");
        bw.newLine();
        bw.write("E esse é o arquivo Lorem 3");

        bw.close();

        // -----------------------------------

        InputStream fis = new FileInputStream("lorem3.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();

        System.out.println();      
        
        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        System.out.println();

        br.close();      

    }
}
