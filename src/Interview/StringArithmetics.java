package Interview;

import java.util.List;

public class StringArithmetics {

    public static List<Character> list = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

    public static String process(String left, String right, String operator) {
        int x = 0;
        int y = 0;
        int multiplier = 1;

        String a = left;
        String b = right;

        if (a.charAt(0) == '-' || a.charAt(0) == '-')
            a = a.substring(1);

        if (b.charAt(0) == '-' || b.charAt(0) == '+')
            b = b.substring(1);

        while (a.length() < b.length())
            a = '0' + a;

        while (b.length() < a.length())
            b = '0' + b;

        int i = b.length() - 1;

        while (i >= 0) {
            x += list.indexOf(a.charAt(i)) * multiplier;
            y += list.indexOf(b.charAt(i)) * multiplier;
            multiplier = multiplier * 10;
            i--;
        }
        y = right.charAt(0) == '-' ? y - 2 * y : y;
        x = left.charAt(0) == '-' ? x - 2 * x : x;

        switch (operator) {
            case "+":
                return String.valueOf(x + y);
            case "-":
                return String.valueOf(x - y);
            case "*":
                return String.valueOf(x * y);
            case "/": {
                return String.valueOf(Float.valueOf(String.valueOf(x)) / Float.valueOf(String.valueOf(y)));
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        System.out.println(process("2", "2", "+"));
    }
}
