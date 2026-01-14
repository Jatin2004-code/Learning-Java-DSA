package Stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                if ((ch == ')' && stack.peek() != '(') ||
                    (ch == '}' && stack.peek() != '{') ||
                    (ch == ']' && stack.peek() != '[')) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "{[()]}";

        if (isValid(s)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}

