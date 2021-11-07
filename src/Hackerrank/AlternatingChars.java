package Hackerrank;

public class AlternatingChars {
    public static int alternatingCharacters(String s) {
        if (s.length() < 2)
            return 0;
        char last = s.charAt(0);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == last)
                count++;
            last = s.charAt(i);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
    }
}
