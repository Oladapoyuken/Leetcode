package MyLeetCodes;

import java.util.ArrayList;
import java.util.List;

public class reverse {
    public int reverse(int x){
        int result = 0;
        int k = 1;

        if((x == 0) || (x >= Integer.MAX_VALUE) || (x <= Integer.MIN_VALUE)){
            return 0;
        }

        if(x < 0) k = -1;
        x = Math.abs(x);
        List<Integer> set = new ArrayList();

        while(x != 0){
            if(set.isEmpty() && (x % 10 == 0)){}
            else{
                set.add(x % 10);
            }
            x = x / 10;
        }
        int i = 0;
        int p = set.size()-1;
        if(p != 0){
            while(i < set.size()) {
                result += set.get(i) * Math.pow(10, p);
                if((result >= Integer.MAX_VALUE) || (result <= Integer.MIN_VALUE)){
                    return 0;
                }
                i++;
                p--;
            }
            return result * k;
        }
        else{
            return set.get(0) * k;
        }

    }

    public int reverse2(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(new reverse().reverse2(214748368));
    }
}

