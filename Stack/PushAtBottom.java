package Stack;

import java.util.Stack;

public class PushAtBottom {

    // -------- Push at Bottom using Recursion --------
    public static void pushAtBottom(Stack<Integer> s, int data) {

        // Base case: stack empty
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Step 1: top element nikaalo
        int top = s.pop();

        // Step 2: recursive call
        pushAtBottom(s, data);

        // Step 3: element wapas push karo
        s.push(top);
    }

    // -------- Main Method --------
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        // Stack: [1, 2, 3] (Top = 3)

        System.out.println("Before push at bottom: " + s);

        pushAtBottom(s, 0);
        // 0 ko bottom me push karna hai

        System.out.println("After push at bottom: " + s);
    }
}

