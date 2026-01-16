package Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class StackUsingDeque {

    static class Stack {
        Deque<Integer> dq = new ArrayDeque<>();

        // push
        void push(int data) {
            dq.addLast(data);
        }

        // pop
        int pop() {
            return dq.removeLast();
        }

        // peek
        int peek() {
            return dq.getLast();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());  // 3
        System.out.println(s.peek()); // 2
    }
}
