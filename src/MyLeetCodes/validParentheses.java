package MyLeetCodes;

import java.util.*;

public class validParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        int i = 1;
        while(i < s.length()){
            stack.add(s.charAt(i));
            char temp = stack.get(stack.size()-2);
            if(map.get(temp) == stack.get(stack.size()-1)) {
                stack.pop();
                stack.pop();
                if (stack.isEmpty() && i < s.length() - 1) {
                    i++;
                    stack.add(s.charAt(i));
                }
            }
            i++;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new validParentheses().isValid("{()}[]{([])}"));
    }
}
