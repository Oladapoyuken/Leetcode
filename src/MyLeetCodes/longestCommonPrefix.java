package MyLeetCodes;

import java.util.*;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (String str: strs) {
            for(int i = 0; i < strs.length; i++){
//                if()
            }
        }


        return result.length() > 0 ? result : "";


    }




    public static void main(String[] args) {
        String[] input = {"ower","fow","flight","fling","flint"};
        System.out.println(new longestCommonPrefix().soln(input));
    }






    public String soln(String[] strs){
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
