package Stack;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean hasDuplicate(String expr) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {

            char ch = expr.charAt(i);

            // closing bracket
            if (ch == ')') {

                int count = 0;

                // pop until opening bracket
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                // if no element between ()
                if (count < 1) {
                    return true;
                }

                // pop opening bracket
                stack.pop();
            } 
            // opening bracket or other characters
            else {
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String expr1 = "((a+b))";
        String expr2 = "(a+b)";

        System.out.println(hasDuplicate(expr1)); // true
        System.out.println(hasDuplicate(expr2)); // false
    }
}
