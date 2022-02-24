package LinkedList;


public class MyLinkedList {
    private Node head;
    private Node tail;

    private int size = 0;

    public void addFirst(int val) {
        Node current = new Node();
        current.value = val;
        if (head == null) {
            head = current;
            tail = current;
        } else {
            current.next = head;
            head = current;
        }
        size++;
    }

    public void addLast(int val) {
        Node current = new Node();
        current.value = val;

        tail.next = current;
        tail = current;

        size++;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int val) {
        if (head == null) return false;

        if (size < 2 && head.value == val) return true;

        Node currentNode = new Node();
        currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value == val) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void remove(int val) {
        Node currentNode = new Node();
        currentNode = head;

        if (size < 2 && head.value == val) {
            head = null;
            return;
        }

        while (currentNode.next != null) {

        }
    }

    public class Node {
        public int value;
        private Node next;

        public void Node(int val) {
            this.value = val;
        }

    }

}
