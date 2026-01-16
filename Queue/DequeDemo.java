package Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // add elements
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(30);

        // current deque: 5 10 20 30
        System.out.println(dq);

        // remove elements
        dq.removeFirst(); // removes 5
        dq.removeLast();  // removes 30

        // now: 10 20
        System.out.println(dq);

        // peek
        System.out.println("First: " + dq.getFirst()); // 10
        System.out.println("Last: " + dq.getLast());   // 20
    }
}

