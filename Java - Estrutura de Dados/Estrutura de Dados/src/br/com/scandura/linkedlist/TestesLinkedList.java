package br.com.scandura.linkedlist;

public class TestesLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addOnBegining("Peter");
        System.out.println(list);
        list.addOnBegining("Lois");
        System.out.println(list);
        list.addOnBegining("Meg");
        System.out.println(list);

        list.addOnEnd("Stewie");
        System.out.println(list);

        list.addOnIndex(2, "Blarg Narf");
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.length());

        list.removeFromBegining();
        System.out.println(list);

        list.removeFromBegining();
        System.out.println(list);

        System.out.println(list.length());

        System.out.println(list.getLast().getElement());

        list.remove(2);
        System.out.println(list);

        System.out.println(list.contains("Stewie"));
        System.out.println(list.contains("Peter"));

        System.out.println(list.getLast().getElement());
    }
}