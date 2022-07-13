package Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

    public static int makeAnagram(String a, String b) {
        Map<Character, Integer> one = new HashMap<>();
        Map<Character, Integer> two = new HashMap<>();
        int count = 0;
        String ab = a + b;
        for (int i = 0; i < ab.length(); i++) {
            char val = ab.charAt(i);
            if (i < a.length())
                one = setMap(val, one);
            else
                two = setMap(val, two);
        }

        Map<Character, Integer> big = one.size() >= two.size() ? one : two;
        Map<Character, Integer> small = one.size() < two.size() ? one : two;
        for (char key : big.keySet()) {
            if (small.containsKey(key)) {
                if (small.get(key) != big.get(key)) {
                    count += Math.abs(small.get(key) - big.get(key));
                }
                small.remove(key);
            } else {
                count += big.get(key);
            }
        }
        for (int val : small.values())
            count += val;
        return count;
    }

    public static Map setMap(char x, Map<Character, Integer> map) {
        if (map.containsKey(x)) {
            int val = map.get(x);
            map.replace(x, val, val + 1);
        } else {
            map.put(x, 1);
        }
        return map;
    }


    public static int sherlockAndAnagrams(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            list.add(s.charAt(i));

        Map<Character, Integer> map = list.stream()
                .collect(Collectors.toMap(Function.identity(), values -> 1, Integer::sum));
        System.out.println(map);

        return 1;
    }


    public static void main(String[] args) {
        int count = sherlockAndAnagrams("abba");
        System.out.println(count);
    }
}
