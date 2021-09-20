package br.com.scandura.pile;

public class Stack {

    private String[] pile = new String[5];
    private int size = 0;

    public boolean isEmpty(){
        return size == 0;
    }
    
    public void push(String string){
        dynamicStorage();
        this.pile[size] = string;
        size++;
    }

    public String pop(){
        String temp = this.pile[size];
        this.pile[size] = null;
        size--;
        return temp;        
    }

    public String peek(){
        return this.pile[size - 1];
    }

    public int size(){
        return this.size;
    }

    public void dynamicStorage(){
        if(size == this.pile.length){
			String[] newPile = new String[this.pile.length * 2];
			for(int i = 0; i < this.pile.length; i++){
				newPile[i] = this.pile[i];
			}
			this.pile = newPile;
		}		
    }
}
