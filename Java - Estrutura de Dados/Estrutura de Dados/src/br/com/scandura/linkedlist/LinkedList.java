package br.com.scandura.linkedlist;

public class LinkedList {

    private Cell first = null;
    private Cell last = null;
    private int totalElements = 0;

    public boolean isEmpty() {
        return this.totalElements == 0;
    }

    public boolean isOccupied(int index) {
        return index >= 0 && index < this.totalElements;
    }

    public Cell getCell(int index) {
        if (!isOccupied(index)) {
            throw new IndexOutOfBoundsException("No elements on that index");
        }

        Cell current = first;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current;
    }

    public void addOnBegining(Object element) {
        Cell c = new Cell(element, first);
        this.first = c;

        if (isEmpty()) { // Setting last when list is empty
            this.last = first;
        }

        this.totalElements++;
    }

    public void addOnIndex(int index, Object element) {
        if (index == 0) {
            addOnBegining(element);
        } else if (index == totalElements) {
            addOnEnd(element);
        } else {
            Cell previous = this.getCell(index - 1);
            Cell fresh = new Cell(element, previous.getNext());
            previous.setNext(fresh);
            this.totalElements++;
        }

    }

    public void addOnEnd(Object element) {
        if (isEmpty()) {
            addOnBegining(element);
        } else {
            Cell c = new Cell(element, null);
            this.last.setNext(c);
            this.last = c;
            this.totalElements++;
        }

    }

    public Object get(int index) {
        return this.getCell(index).getElement();
    }

    public void removeFromBegining() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        this.first = this.first.getNext();
        totalElements--;

        if (isEmpty()) {
            this.last = null;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFromBegining();
        } else {
            if (isEmpty()) {
                throw new IllegalArgumentException("List is empty");
            }
            Cell current = getCell(index);
            Cell next = current.getNext();
            Cell previous = this.getCell(index - 1);
            previous.setNext(next);
            current = null;
            totalElements--;
        }
    }

    public int length() {
        return this.totalElements;
    }

    public boolean contains(Object o) {
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "List is empty";
        }

        Cell c = first;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < totalElements; i++) {
            builder.append(c.getElement() + ", ");
            c = c.getNext();
        }
        return builder.toString();
    }

}
