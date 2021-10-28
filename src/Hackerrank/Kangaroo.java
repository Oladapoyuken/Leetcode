package Hackerrank;

public class Kangaroo {

    //UNSOLVED

    public static void main(String[] args) {
        System.out.println(new Kangaroo().kangaroo(2, 1, 1, 2));
    }

    public String kangaroo(int x1, int v1, int x2, int v2) {
        int val1 = 0;
        int val2 = 0;

        if (x2 > x1 && v2 > v1) {
            return "NO";
        }
//        else{
//            val1 = x1 + (v1 * Math.max(x1, x2));
//            val2 = x2 + (v2 * Math.max(x1, x2));
//        }

//        return val1 == val2 ? "YES" : "NO";
        return "YES";
    }
}
