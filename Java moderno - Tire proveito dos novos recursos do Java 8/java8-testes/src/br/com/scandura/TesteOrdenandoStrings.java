package br.com.scandura;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteOrdenandoStrings{
    public static void main(String[] args) {
        List<String> frases = new ArrayList<>();

        frases.add("Zapdos is a really cool flying type pokemon");
        frases.add("Um milhão de vagalumes");
        frases.add("Arroz feijão batata e macarrão");

        Comparator<String> comparador = new ComparadorDeFrases();
        
        //Collections.sort(frases, comparador);
        frases.sort(comparador);

        // for (String frase : frases) {
        //     System.out.println(frase);
        // }

        Consumer<String> consumidor = new ImprimirFrase();
        frases.forEach(consumidor);
    }
}

class ComparadorDeFrases implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1;
        }
        if(o1.length() < o2.length()){
            return -1;
        }
        return 0;
    }

}

class ImprimirFrase implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);        
    }    
}