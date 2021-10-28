package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hourglassSum {
    public static void main(String[] args) {
        List<List<Integer>> row = new ArrayList<>();
        row.add(Arrays.asList(-1, -1, 0, -9, -2, -2));
        row.add(Arrays.asList(-2, -1, -6, -8, -2, -5));
        row.add(Arrays.asList(-1, -1, -1, -2, -3, -4));
        row.add(Arrays.asList(-1, -9, -2, -4, -4, -5));
        row.add(Arrays.asList(-7, -3, -3, -2, -9, -9));
        row.add(Arrays.asList(-1, -3, -1, -2, -4, -5));

//        System.out.println(row);

        System.out.println(new hourglassSum().hourglassSum(row));
    }

    public int hourglassSum(List<List<Integer>> arr) {
        int max = 0;
        boolean start = true;

        for (int i = 0; i < 4; i++) {
            List rowOne = arr.get(i);
            List rowTwo = arr.get(i + 1);
            List rowThree = arr.get(i + 2);

            int temp = 0;
            for (int k = 0; k < 4; k++) {
                int top = (int) rowOne.get(k) + (int) rowOne.get(k + 1) + (int) rowOne.get(k + 2);
                int mid = (int) rowTwo.get(k + 1);
                int bottom = (int) rowThree.get(k) + (int) rowThree.get(k + 1) + (int) rowThree.get(k + 2);

                temp = top + mid + bottom;

                if (start) {
                    max = temp;
                    start = false;
                }
                max = Math.max(max, temp);
            }
        }

        return max;
    }
}
