package br.com.scandura.doublylinkedlist;

public class Cell {

    private Object element;
    private Cell next;
    private Cell previous;

    public Cell(Object element, Cell next){
        this.element = element;
        this.next = next;
    }

    public Cell getPrevious(){
        return this.previous;
    }

    public void setPrevious(Cell previous){
        this.previous = previous;
    }

    public Cell getNext(){
        return next;
    }

    public void setNext(Cell next){
        this.next = next;
    }

    public Object getElement(){
        return this.element;
    }
}
