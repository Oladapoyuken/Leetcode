package CodeWithMosh;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque();

        Stack<Integer> stack = new Stack<>();

        queue.add(7);
        queue.add(13);


        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());


    }
}
