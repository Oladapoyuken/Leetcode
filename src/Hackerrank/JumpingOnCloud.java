package Hackerrank;

import java.util.Arrays;
import java.util.List;

public class JumpingOnCloud {
    public static void main(String[] args) {
        System.out.println(new JumpingOnCloud().JumpingOnCloud(Arrays.asList(0, 0, 0, 1, 0, 0)));
    }

    public int JumpingOnCloud(List<Integer> c) {
        int steps = 0;
        int counter = 1;
        for (int i = 1; i < c.size(); i++) {
            if (c.get(i) == 0) {
                steps++;
                counter++;
            } else {
                counter = 0;
                continue;
            }
            if (counter == 3) {
                steps--;
                counter = 1;
            }
        }
        return steps;
    }
}
