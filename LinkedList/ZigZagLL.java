package LinkedList;

public class ZigZagLL {

    Node head;
    // → LinkedList ka starting point

    // -------- Node class --------
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -------- addLast() --------
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // -------- ZIG ZAG FUNCTION --------
    public void zigZag() {

        // case: empty or single node
        if (head == null || head.next == null) {
            return;
        }

        // -------- STEP 1: Find mid --------
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        // → mid node mil gaya

        // -------- STEP 2: Reverse second half --------
        Node curr = mid.next;
        mid.next = null;
        // → list ko 2 halves me tod diya

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        // → second half reverse ho chuki hai

        Node left = head;
        // → first half ka head

        // -------- STEP 3: Zig-Zag merge --------
        Node nextL, nextR;

        while (left != null && right != null) {

            nextL = left.next;
            nextR = right.next;

            left.next = right;
            // → left ke baad right joda

            right.next = nextL;
            // → right ke baad next left joda

            left = nextL;
            right = nextR;
        }
    }

    // -------- print list --------
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- main method --------
    public static void main(String[] args) {

        ZigZagLL ll = new ZigZagLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // Before zig-zag
        ll.printList();

        ll.zigZag();
        // → Zig-Zag operation

        // After zig-zag
        ll.printList();
    }
}



//Before: 1 -> 2 -> 3 -> 4 -> 5 -> null
//After : 1 -> 5 -> 2 -> 4 -> 3 -> null
