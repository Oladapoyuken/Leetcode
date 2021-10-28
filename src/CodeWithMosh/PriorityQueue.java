package CodeWithMosh;

import java.util.Arrays;

public class PriorityQueue {

    private int[] arr;

    public PriorityQueue() {
        arr = new int[0];
    }

    public void enqueue(int val) {
        if (arr.length < 1)
            arr = new int[]{val};                   //[4, 1, 5, 3]
        else {
            int[] newArr = Arrays.copyOf(arr, arr.length + 1);
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > val) {
                    newArr[i + 1] = arr[i];
                } else {
                    newArr[i] = val;
                }
            }

            arr = newArr;
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
