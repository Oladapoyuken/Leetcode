package Hackerrank;

import java.util.List;

public class Bribe {

    //UNSOLVED

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes = 0;
        boolean chaotic = false;
        for (int i = q.size() - 1; i >= 0; i--) {
            for (int k = i - 1; k >= 0; k--) {
                if (q.get(k) > q.get(i)) {
                    bribes++;
                    if ((q.get(k) - 1) - k > 2)
                        chaotic = true;
                }
            }
        }
        System.out.println(bribes);

        if (chaotic)
            System.out.println("Too chaotic");
    }

    public static void main(String[] args) {
        minimumBribes(List.of(5, 1, 2, 3, 7, 8, 6, 4));

    }
}
