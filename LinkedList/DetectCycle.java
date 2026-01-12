package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycle {

    // Floyd's Cycle Detection Algorithm
    static boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // 1 step
            fast = fast.next.next;      // 2 steps

            if (slow == fast) {         // meet ho gaye => cycle present
                return true;
            }
        }
        return false; // fast null पहुंच गया => koi cycle नहीं
    }

    public static void main(String[] args) {
        // Example Linked List
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // cycle create kar rahe hain: 4 -> 2
        head.next.next.next.next = head.next;

        if (hasCycle(head)) {
            System.out.println("Cycle present");
        } else {
            System.out.println("No cycle");
        }
    }
}
