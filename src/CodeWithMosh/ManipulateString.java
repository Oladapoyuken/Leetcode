package CodeWithMosh;

import java.util.Stack;

public class ManipulateString {

    public String reverse(String string) {
        if (string == null) throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for (char val : string.toCharArray()) {
            stack.push(val);
        }
        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString();
    }

    public boolean balanced(String string) {
        if (string == null) throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for (char val : string.toCharArray()) {
            if (val == '(' || val == '<' || val == '{' || val == '[')
                stack.push(val);
            if (stack.isEmpty()) return false;

            if (val == ')' && stack.peek() == '(')
                stack.pop();
            else if (val == '>' && stack.peek() == '<')
                stack.pop();
            else if (val == '}' && stack.peek() == '{')
                stack.pop();
            else if (val == ']' && stack.peek() == '[')
                stack.pop();
        }
        return stack.isEmpty();
    }
}
