package Hackerrank;

public class CountingValley {

    public static void main(String[] args) {
        System.out.println(new CountingValley().CountingValley(5, "UDDDU"));
    }

    public int CountingValley(int steps, String path) {
        int valley = 0;
        boolean isValley = false;
        int count = 0;

        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                count++;
            } else {
                count--;
            }
            if (count < 0) isValley = true;
            if (isValley) {
                if (count == 0) {
                    valley++;
                    isValley = false;
                }
            }
        }
        return valley;
    }
}
