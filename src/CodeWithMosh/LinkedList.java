package CodeWithMosh;

import java.util.NoSuchElementException;

public class LinkedList {

    int size;
    private Node head;
    private Node tail;

    void addFirst(int value) {
        var newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void addLast(int value) {
        var newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {

            tail.next = newNode;

            tail = newNode;

        }

        size++;
    }

    void deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
            return;
        } else {
            var tempNode = head.next;
            head.next = null;
            head = tempNode;
        }

        size--;
    }

    void deleteLast() {

        if (head == null) throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;
            return;
        } else {
            var preNode = getPrevious(head);
            preNode.next = null;
            tail = preNode;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var iteNode = head;
        while (iteNode != null) {
            if (iteNode.next == tail) return iteNode;
            iteNode = iteNode.next;
        }
        return null;
    }

    boolean contains(int value) {
        return indexOf(value) != -1;
    }

    int indexOf(int value) {
        var iteNode = head;
        int count = 0;
        while (iteNode != null) {
            if (iteNode.value == value) return count;
            iteNode = iteNode.next;
            count++;
        }
        return -1;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        var iteNode = head;
        int i = 0;
        while (iteNode != null) {
            arr[i++] = iteNode.value;
            iteNode = iteNode.next;
        }
        return arr;
    }

    public void reverse() {
        var current = head.next;

        while (current != null) {
            var next = current.next;
            current = next;
        }
        tail = head;
        tail.next = null;


    }

    public int getKthValueFromEnd(int k) {
        var a = head;
        var b = head;

        if (a == null) throw new IllegalStateException();

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) throw new IllegalArgumentException();
        }

        while (b != tail) {
            b = b.next;
            a = a.next;
        }
        return a.value;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }
}
