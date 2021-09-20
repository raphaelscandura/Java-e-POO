package br.com.scandura.queue;

public class Queue {
    
    private String[] queue = new String[5];
    private int size = 0;

    public boolean isEmpty(){
        return size == 0;
    }
    
    public void push(String string){
        dynamicStorage();
        this.queue[size] = string;
        size++;
    }

    public String pop(){
        String temp = this.queue[size];
        this.queue[size] = null;
        size--;
        return temp;        
    }

    public String peek(){
        return this.queue[size - 1];
    }

    public int size(){
        return this.size;
    }

    public void dynamicStorage(){
        if(size == this.queue.length){
			String[] newqueue = new String[this.queue.length * 2];
			for(int i = 0; i < this.queue.length; i++){
				newqueue[i] = this.queue[i];
			}
			this.queue = newqueue;
		}		
    }
}
