package br.com.scandura.set;

public class SetTests {
    public static void main(String[] args) {
        Set test = new Set();
        test.add("Raphael");
        test.add("Raphaela");
        test.add("Raphaelito");

        test.add("Juan");
        test.add("Joaquim");
        test.add("Jacob");

        test.add("Aileen");
        test.add("Bruno");
        test.add("Zyzz");
        System.out.println(test);

        test.remove("Zyzz");
        test.remove("Joaquim");
        test.remove("Raphaela");

        System.out.println(test);

    }
    
}
