package Hackerrank;

import java.util.List;

public class Bribe {

    //UNSOLVED

    public static void minimumBribes(List<Integer> q) {
        boolean chaos = false;
        int bribes = 0;
        int count = 1;
        for (int i = 0; i < q.size(); i++) {
            int member = q.get(i);
            if (member > count) {
                if (member - count > 2) {
                    System.out.println("Too chaotic");
                    chaos = true;
                    break;
                } else {
                    bribes = bribes + member - count;
                }
            }

            count++;
        }
        if (!chaos) System.out.println(bribes);
    }

    public static void main(String[] args) {

        minimumBribes(List.of(1, 2, 5, 3, 7, 8, 6, 4));

    }
}
