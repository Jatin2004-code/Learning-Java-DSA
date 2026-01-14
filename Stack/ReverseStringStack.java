package Stack;

import java.util.Stack;

public class ReverseStringStack {

    public static String reverse(String str) {

        Stack<Character> s = new Stack<>();

        // push all characters
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        // pop all characters
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse(str));
    }
}
