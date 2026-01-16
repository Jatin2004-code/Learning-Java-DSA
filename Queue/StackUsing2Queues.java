package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public boolean isEmpty() {
            return q1.isEmpty();
        }

        // push -> O(n)
        public void push(int data) {

            // step 1: add to q2
            q2.add(data);

            // step 2: move all from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // step 3: swap q1 & q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // pop -> O(1)
        public int pop() {

            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.remove();
        }

        // peek
        public int peek() {

            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.peek();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

