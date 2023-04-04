package org.example.adt;

public class DynamicSet implements ISet {

    private Node first;

    @Override
    public void add(int a) {
        // TODO
    }

    @Override
    public void remove(int a) {
        Node candidate = this.first;
        while(candidate.getNext() != null && candidate.getValue() != a) {
            if(candidate.getValue() == a) {
                candidate.setNext(candidate.getNext());
                return;
            }
            candidate = candidate.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int choose() {
        return 0;
    }
}
