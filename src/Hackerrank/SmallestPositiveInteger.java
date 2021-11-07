package Hackerrank;

import java.util.Set;
import java.util.TreeSet;

public class SmallestPositiveInteger {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0)
                set.add(A[i]);
        }
        if (set.isEmpty())
            return 1;
        int count = 1;
        for (int val : set) {
            if (count < val & set.contains(count) == false)
                return count;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = solution(new int[]{-1, 6, -4, 0, 1});
        System.out.println(x);
    }

}
