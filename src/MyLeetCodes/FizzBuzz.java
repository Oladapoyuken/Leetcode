package MyLeetCodes;

public class FizzBuzz {
    public static void main(String[] args) {
        new FizzBuzz().fizzBuzz(15);


    }

    public void fizzBuzz(int n) {
        // Write your code here
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }

    }
}
