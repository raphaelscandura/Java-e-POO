package br.com.scandura.queue;

public class QueueTests {
    public static void main(String[] args) {
        Queue test = new Queue();
        test.push("Bom dia");
        test.push("They're taking the hobbits to Isengard");
        test.push("SBT Silvio Santos");

        System.out.println(test.peek());
        System.out.println(test.pull());
        
        System.out.println(test.peek());
        System.out.println(test.pull());
    }
}
