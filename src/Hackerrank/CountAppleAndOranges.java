package Hackerrank;

import java.util.Arrays;
import java.util.List;

public class CountAppleAndOranges {

    public CountAppleAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apple = 0;
        int orange = 0;
        for (int i = 0; i < apples.size(); i++) {
            int x = apples.get(i);
            if (x >= 0) {
                if ((a + x) >= s && (a + x) <= t) apple++;
            }
        }
        for (int i = 0; i < oranges.size(); i++) {
            int x = oranges.get(i);
            if (x <= 0) {
                if ((b + x) <= t && (b + x) >= s) orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }


    public static void main(String[] args) {
        new CountAppleAndOranges(7, 10, 4, 12, Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));

    }
}
