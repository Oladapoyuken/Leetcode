package Hackerrank;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(new RepeatedString().RepeatedString("a", 100000));
    }

    public long RepeatedString(String s, long n) {
        long frequency = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') frequency++;
        }
        frequency = n / s.length() * frequency;
        long k = n % s.length();
        long rest = 0;
        if (k > 0) {
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'a') rest++;
            }
        }
        return frequency + rest;
    }
}
