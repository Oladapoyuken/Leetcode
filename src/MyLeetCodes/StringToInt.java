package MyLeetCodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringToInt {
    public int myAtoi(String s) {
        int ve = 1;
        Set set = new HashSet(Arrays.asList('-','+','1','2','3','4','5','6','7','8','9','0'));
        String num = "";
        boolean stp = true;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                    if(stp == true){
                        num = String.valueOf(s.charAt(i));
                        stp = false;
                    }
                    else{
                        break;
                    }
                }
                else{
                    num += s.charAt(i);
                    Long x = Long.parseLong(num);
                    if(x >= Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                    else if(x <= Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                    stp= false;
                }
            }
            else if(!num.equals("") || s.charAt(i) != ' '){
                break;
            }
        }
        if(num.equals("") || num.equals("+") || num.equals("-")) return 0;

        else{
            int re = Integer.parseInt(num);
            return re;
        }
    }

    public static void main(String[] args) {
        System.out.println(new StringToInt().myAtoi("20000000000000000000"));
    }
}
