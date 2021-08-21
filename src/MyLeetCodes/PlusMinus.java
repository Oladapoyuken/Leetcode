package MyLeetCodes;

public class PlusMinus {
    public static void main(String[] args) {
        String s = "plus";
//        System.out.println(s.substring(0,4));
        System.out.println(new PlusMinus().solution(s));
    }

    public String solution(String S) {
        // write your code in Java SE 8
        String result = "";
        String hold = "";
        for (int i = 0; i < S.length(); i++) {
            hold += S.charAt(i);
            if (hold.equals("plus")) {
                hold = "";
                result += "+";
            } else if (hold.equals("minus")) {
                hold = "";
                result += "-";
            }
        }
        return result;
    }
}
