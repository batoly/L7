/**
 * Created by Lenovo on 2/20/2022.
 */
public class CircularyLinkedList<E> {

    private Node<E> tail = null;
    private int size = 0;

    public CircularyLinkedList() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty())
            return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void addfirst(E el) {
        if (size == 0) {
            tail = new Node<E>(el, null);
            tail.setNext(tail);
        } else {
            Node<E> newst = new Node<E>(el, tail.getNext());
            tail.setNext(newst);
        }
        size++;
    }

    public void addlast(E el) {
        addfirst(el);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> x = tail.getNext();
        if (x == tail)
            tail = null;
        else
            tail.setNext(x.getNext());
        size--;
        return x.getElement();

    }

    public void rotate() {
        if (tail != null)
            tail = tail.getNext();
    }

    public void addFirst(E el) {
        if (size == 0) {
            tail = new Node<E>(el, null);
            tail.setNext(tail);
        } else {
            Node<E> newst = new Node<E>(el, tail.getNext());
            tail.setNext(newst);
        }
        size++;
    }

    public void addLast(E el) {
        addfirst(el);
        tail = tail.getNext();
    }


    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
     class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

