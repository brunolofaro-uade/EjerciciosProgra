package adt;

public class GenericNode<T> {
    private T value;
    private GenericNode next;

    public GenericNode(T value, GenericNode next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public GenericNode getNext() {
        return next;
    }

    public void setNext(GenericNode next) {
        this.next = next;
    }
}
