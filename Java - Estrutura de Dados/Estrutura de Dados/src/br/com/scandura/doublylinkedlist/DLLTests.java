package br.com.scandura.doublylinkedlist;

public class DLLTests {
    public static void main(String[] args) {
        DoublyeLinkedList list = new DoublyeLinkedList();
        list.addOnBegining("Peter");
        System.out.println(list);
        list.addOnBegining("Lois");
        System.out.println(list);
        list.addOnBegining("Meg");
        System.out.println(list);

        list.addOnEnd("Elon");
        System.out.println(list);
        list.addOnEnd("Joma");
        System.out.println(list);
        list.addOnEnd("Jerma");
        System.out.println(list);

        System.out.println(list.get(3));
        list.addOnIndex(3, "Bilbo");
        System.out.println(list);
        System.out.println(list.get(3)); 

        list.remove(6);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        System.out.println(list.contains("Lois"));
        System.out.println(list.contains("Meg"));
        System.out.println(list.contains("Bilbo"));

    }
}
