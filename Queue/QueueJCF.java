package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueJCF {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.peek());   // 10

        q.remove();                     // remove 10

        System.out.println(q.peek());   // 20
    }
}

