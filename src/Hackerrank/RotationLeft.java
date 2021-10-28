package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class RotationLeft {

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> list = new ArrayList<>();

        for (int i = d; i < a.size(); i++) list.add(a.get(i));

        for (int k = 0; k < d; k++) list.add(a.get(k));

        return list;
    }

    public static void main(String[] args) {

        List<Integer> list = rotLeft(List.of(1, 2, 3, 4, 5), 4);

        System.out.println(list);
    }
}


