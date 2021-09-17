package br.com.scandura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.InputStream;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        
        InputStream fis = new FileInputStream("lorem.txt");
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
