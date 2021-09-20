package br.com.scandura.set;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Set {

    private ArrayList<LinkedList<String>> table = new ArrayList<LinkedList<String>>();

    public Set() {
        for (int i = 0; i < 26; i++) {
            table.add(new LinkedList<String>());
        }
    }

    private int tableIndexCalc(String string) {
        return string.toLowerCase().charAt(0) % 26;
    }

    private boolean contains(String string) {
        int index = tableIndexCalc(string);
        List<String> list = table.get(index);
        return list.contains(string);
    }

    public void add(String string) {
        if (!contains(string)) {
            int index = tableIndexCalc(string);
            List<String> list = table.get(index);
            list.add(string);
        }else{
            throw new IllegalArgumentException("The string: " + string + " already exists on this set");
        }

    }

    public void remove(String string){
        if(contains(string)){
            int index = tableIndexCalc(string);
            List<String> list = table.get(index);
            list.remove(string);
        }
    }

    @Override
    public String toString() {
        return table.toString();
    }

}
