package Queue;
import java.util.Stack;

public class QueueUsing2Stacks {

    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add (enqueue) -> O(n)
        public void add(int data) {

            // step 1: s1 -> s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // step 2: push data in s1
            s1.push(data);

            // step 3: s2 -> s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove (dequeue) -> O(1)
        public int remove() {

            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        // peek
        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
