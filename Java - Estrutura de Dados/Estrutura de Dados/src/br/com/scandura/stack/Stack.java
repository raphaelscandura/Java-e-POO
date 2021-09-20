package br.com.scandura.stack;

public class Stack {

    private String[] stack = new String[5];
    private int size = 0;

    public boolean isEmpty(){
        return size == 0;
    }
    
    public void push(String string){
        dynamicStorage();
        this.stack[size] = string;
        size++;
    }

    public String pop(){
        String temp = this.stack[size];
        this.stack[size] = null;
        size--;
        return temp;        
    }

    public String peek(){
        return this.stack[size - 1];
    }

    public int size(){
        return this.size;
    }

    public void dynamicStorage(){
        if(size == this.stack.length){
			String[] newstack = new String[this.stack.length * 2];
			for(int i = 0; i < this.stack.length; i++){
				newstack[i] = this.stack[i];
			}
			this.stack = newstack;
		}		
    }
}
