package MyLeetCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class palindrome {
    public boolean palindrome(int x){
        if(x < 0)return false;
        List<Integer> list= new ArrayList<>();
        while(x != 0){
            list.add(x % 10);
            x /= 10;
        }
        int min = 0;
        int max = list.size()-1;
        while(min <= max) {
            if (list.get(min) != list.get(max)) {
                return false;
            }
            min++; max--;
        }
        return true;
    }

    public boolean palindrome2(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }



    public static void main(String[] args) {
        if(new palindrome().palindrome(1234321)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
