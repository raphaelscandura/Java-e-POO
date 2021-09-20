package br.com.scandura.pile;

public class StackTests {
    public static void main(String[] args) {
        Stack test = new Stack();
        test.push("Bom dia");
        System.out.println(test.peek());
        test.push("They're taking the hobbits to Isengard");
        System.out.println(test.peek());
        test.push("SBT Silvio Santos");
        System.out.println(test.peek());

        System.out.println(test.size());

        test.pop();
        System.out.println(test.peek());

        System.out.println(test.size());

    }
}
