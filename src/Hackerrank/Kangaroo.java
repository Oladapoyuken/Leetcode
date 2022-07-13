package Hackerrank;

public class Kangaroo {

    public static void main(String[] args) {
        System.out.println(new Kangaroo().kangaroo(4523, 8092, 9419, 8076));
    } //4523 8092 9419 8076

    public String kangaroo(int x1, int v1, int x2, int v2) {
        while (x1 <= 1000000000 & x2 <= 1000000000) {
            x1 += v1;
            x2 += v2;

            if (x1 == x2)
                return "YES";
        }
        return "NO";
    }
}
