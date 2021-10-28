package CodeWithMosh;

import java.util.Arrays;

public class ArrayQueue {
    private int[] arr = new int[5];
    private int next = 0;
    private int current = 0;

    public void enqueue(int val) {
        if (arr.length == current) throw new IllegalStateException();
        arr[current++] = val;
    }

    public int dequeue() {
        if (current < 1) throw new IllegalStateException();
        return arr[next++];
    }

    public int peek() {
        if (current < 1) throw new IllegalStateException();
        return arr[next];
    }

    public boolean isEmpty() {
        return next > current;
    }

    public boolean isFull() {
        return arr.length == current;
    }

    @Override
    public String toString() {
        int[] array = Arrays.copyOfRange(arr, next, current);
        return Arrays.toString(array);
    }
}
