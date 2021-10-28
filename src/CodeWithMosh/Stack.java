package CodeWithMosh;

import java.util.Arrays;

public class Stack {
    private int[] arr;
    private int size = 0;

    public Stack() {
        arr = new int[0];
    }

    public void push(int val) {
        int[] newArr = new int[size + 1];
        if (size < 1) {
            arr = new int[]{val};
        } else {
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            newArr[size] = val;
            arr = newArr;
        }
        size = arr.length;
    }

    public int pop() {
        size--;
        int val = arr[size];
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return val;
    }

    public int peep() {
        return arr[size - 1];
    }

    public boolean isEmpty() {
        return size < 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
