package CodeWithMosh;

import java.util.Stack;

public class Queue {

    public void reversed(java.util.Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());

        System.out.println(queue);
    }

}
