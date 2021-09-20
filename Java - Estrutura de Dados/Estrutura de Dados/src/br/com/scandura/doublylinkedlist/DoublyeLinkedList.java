package br.com.scandura.doublylinkedlist;

public class DoublyeLinkedList {
    private Cell first = null;
    private Cell last = null;
    private int totalElements = 0;

    public Cell getLast() {
        return this.last;
    }

    public Cell getFirst() {
        return this.first;
    }

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
        if (isEmpty()) { // Setting last when list is empty
            Cell current = new Cell(element, first);
            this.first = current;
            this.last = current;
        } else {
            Cell current = new Cell(element, this.first);
            this.first.setPrevious(current);
            this.first = current;

        }

        this.totalElements++;
    }

    public void addOnIndex(int index, Object element) {
        if (index == 0) {
            addOnBegining(element);
        } else if (index == totalElements) {
            addOnEnd(element);
        } else {
            Cell current = this.getCell(index);
            Cell previous = current.getPrevious();
            Cell fresh = new Cell(element, current);
            fresh.setPrevious(previous);
            previous.setNext(fresh);
            current.setPrevious(fresh);
            this.totalElements++;
        }

    }

    public void addOnEnd(Object element) {
        if (isEmpty()) {
            addOnBegining(element);
        } else {
            Cell current = new Cell(element, null);
            this.last.setNext(current);
            current.setPrevious(this.last);
            this.last = current;
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

    public void removeFromEnd() {
        if (this.totalElements == 1) {
            removeFromBegining();
        } else if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        } else {
            Cell newLastCell = this.last.getPrevious();
            newLastCell.setNext(null);
            this.last = newLastCell;
            this.totalElements--;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFromBegining();
        } else if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        } else if (index == totalElements - 1) {
            removeFromEnd();
        } else {
            Cell current = getCell(index);
            Cell next = current.getNext();
            Cell previous = current.getPrevious();
            next.setPrevious(previous);
            previous.setNext(next);
            this.totalElements--;
        }

    }

    public int length() {
        return this.totalElements;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < totalElements; i++) {
            Cell current = getCell(i);
            if (current.getElement() == o) {
                return true;
            }
        }
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
