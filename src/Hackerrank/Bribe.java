package Hackerrank;

import java.util.List;

public class Bribe {

    public static void minimumBribes(List<Integer> q) {
        int bribe = 0;
        boolean chaotic = false;
        int i = q.size() - 2;
        while (i >= 0 & chaotic == false) {
            int count = 0;
            for (int k = i + 1; k < q.size(); k++) {
                if (q.get(k) < q.get(i)) {
                    bribe++;
                    count++;
                }
                if (count > 2) {
                    chaotic = true;
                    break;
                }
            }
            i--;
        }
        if (chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);
    }

    public static void main(String[] args) {
        minimumBribes(List.of(1, 2, 5, 3, 7, 8, 6, 4));

    }
}
