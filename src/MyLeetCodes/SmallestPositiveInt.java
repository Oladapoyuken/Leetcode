package MyLeetCodes;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SmallestPositiveInt {
    public static void main(String[] args) {
        System.out.println(new SmallestPositiveInt().solution(new int[]{2}));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int val = 1;
        if (A.length < 2) {
            return val = A[0] > val ? val : val + 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i : A) {
            list.add(i);
        }
        list.sort(Comparator.naturalOrder());
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) == val) {
                val++;
            } else if (list.get(k) > val) break;
        }
        return val;
    }
}
