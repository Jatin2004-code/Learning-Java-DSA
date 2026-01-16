package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class InterleaveQueue {

    public static void interleaveQueue(Queue<Integer> q) {

        int size = q.size();

        // even length check
        if (size % 2 != 0) {
            System.out.println("Queue size must be even");
            return;
        }

        Queue<Integer> first = new LinkedList<>();

        // step 1: store first half in helper queue
        for (int i = 0; i < size / 2; i++) {
            first.add(q.remove());
        }

        // step 2: interleave both halves
        while (!first.isEmpty()) {
            q.add(first.remove()); // first half element
            q.add(q.remove());     // second half element
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // input: 1 to 10
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        interleaveQueue(q);

        // print result
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
