package LinkedList;

public class LinkedList {


    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        java.util.LinkedList list_ = new java.util.LinkedList();


        list.addFirst(4);
        list.addFirst(3);
        list.addLast(2);

        System.out.println(list.contains(9));
    }
}
