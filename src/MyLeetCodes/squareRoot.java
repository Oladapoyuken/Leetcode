package MyLeetCodes;

public class squareRoot {
    public int mySqrt(int x) {
        String s = String.valueOf(Math.sqrt(x));
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.'){
                x = Integer.parseInt(s.substring(0, i));
            }
        }
        return x;

    }

    public static void main(String[] args) {
        System.out.println(new squareRoot().mySqrt(8));
    }
}
