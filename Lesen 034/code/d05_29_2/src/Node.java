public class Node<E> {
    private Node<E> prev;
    private Node<E> next;
    private E value;

    public Node(Node<E> prev, Node next, E value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
