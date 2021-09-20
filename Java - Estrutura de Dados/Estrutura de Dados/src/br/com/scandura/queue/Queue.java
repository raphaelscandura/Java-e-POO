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

    public String pull(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("The queue is empty, there's nothing to remove");
        }else {
            String temp = this.queue[0];
            this.queue[0] = null;
            size--;
            for(int i = 0; i < size; i++){
                this.queue[i] = this.queue[i+1];
            }
            return temp; 
        }
               
    }

    public String peek(){
        return this.queue[0];
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
