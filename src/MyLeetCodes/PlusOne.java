package MyLeetCodes;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int position = digits.length - 1;
        List list = new ArrayList<>();
        while(position >= 0){
            if(digits[position] < 9){
                digits[position] = digits[position] + 1;
                break;
            }
            else{
                digits[position] = 0;
                if(position == 0){
                    list.add(1);
                    for(int i = 0; i < digits.length; i++){
                        list.add(digits[i]);
                    }
                    int[] ans = new int[list.size()];
                    for(int i = 0; i < list.size(); i++){
                        ans[i] = (int) list.get(i);
                    }
                    return ans ;
                }
            }
            position--;
        }
        return digits;
    }

    public static void main(String[] args) {
        for (int x: new PlusOne().plusOne(new int[]{9})) {
            System.out.print(x);
        }
    }
}
