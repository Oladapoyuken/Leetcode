package CodeWithMosh;

import java.util.Arrays;

public class MyArray {

    int[] arr;
    private int length = 0;

    public MyArray(int length) {

    }

    public void insert(int x) {

        if (length == 0) {
            arr = new int[1];
            arr[0] = x;
            length = 1;
        } else {
            int[] newArr = new int[length + 1];
            for (int i = 0; i < length; i++) {
                newArr[i] = arr[i];
            }
            newArr[length] = x;
            length++;
            arr = newArr;
        }

    }

    public void removeAt(int x) {
        if (x < 0 || length < x) {
            System.out.println("-1");

            return;
        }
        int[] newArr = new int[length - 1];
        boolean seen = false;
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (i == x) {
                seen = true;
                continue;
            }

            newArr[k] = arr[i];
            k++;
        }
        if (seen) length--;
        arr = newArr;

    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

}
