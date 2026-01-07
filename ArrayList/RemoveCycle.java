package ArrayList;
    
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class RemoveCycle {

    // Detect and remove cycle
    static void detectAndRemoveCycle(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head, fast = head;

        // Step 1: Detect cycle using Floyd's algo
        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps
            if (slow == fast) {        // meet => cycle present
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) return;

        // Step 2: Find start of loop
        slow = head;
        Node prev = null;              // last node of loop ko track karne ke liye
        while (slow != fast) {
            prev = fast;               // fast ka previous store
            slow = slow.next;
            fast = fast.next;
        }

        // Ab slow == fast == start of loop
        // Step 3: prev is last node in loop, uska next null kar do
        prev.next = null;
    }

    // Helper: print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5
        //           ^         |
        //           |_________|
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        detectAndRemoveCycle(head);

        // ab list linear ho jayegi
        printList(head);
    }
}
