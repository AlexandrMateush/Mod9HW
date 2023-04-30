package org.example;

public class MyQueue<E> {
    private NodeQ <E> first;
    private NodeQ <E> last;

    public void add(E value) {
        NodeQ<E> newNode = new NodeQ<E> (value);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    public void clear() {
        first = null;
        last = null;
    }

    public int size() {
        int count = 0;
        NodeQ<E> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public E peek() {
        if (first == null) {
            return null;
        } else {
            return first.value;
        }
    }

    public E poll() {
        if (first == null) {
            return null;
        } else {
            E value = first.value;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return value;
        }
    }
    private static class NodeQ <E> {
        E value;
        NodeQ<E> next;

        public NodeQ(E value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        MyQueue<Object> myQueue = new MyQueue<>();

    }

}
