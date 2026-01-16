package Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class QueueUsingDeque {

    static class Queue {
        Deque<Integer> dq = new ArrayDeque<>();

        // enqueue
        void add(int data) {
            dq.addLast(data);
        }

        // dequeue
        int remove() {
            return dq.removeFirst();
        }

        // peek
        int peek() {
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove()); // 1
        System.out.println(q.peek());   // 2
    }
}

