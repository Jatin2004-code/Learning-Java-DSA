package LinkedList;

// → Package ka naam LinkedList hai

public class RemoveFirst {
// → Class ka naam RemoveFirst

    Node head;
    // → LinkedList ka first node (starting point)

    Node tail;
    // → LinkedList ka last node

    int size;
    // → LinkedList ka total size

    // -------- Node class --------
    class Node {
        int data;
        Node next;
        // → Node ke paas data aur next reference hota hai

        Node(int data) {
            this.data = data;
            // → Data assign kiya
            this.next = null;
            // → Next initially null
        }
    }

    // -------- removeFirst() function --------
    public void removeFirst() {

        // agar list empty hai
        if (head == null) {
            System.out.println("LinkedList is empty");
            // → Remove karne ke liye kuch hai hi nahi
            return;
        }

        // agar list me sirf ek hi element hai
        if (size == 1) {
            head = tail = null;
            // → Head aur tail dono null kar diye
            size = 0;
            return;
        }

        head = head.next;
        // → Head ko next node par shift kar diya
        // → Pehla node automatically remove ho gaya

        size--;
        // → Size decrease
    }

    // -------- print / display --------
    public void printList() {

        Node temp = head;
        // → Traversal ke liye temp pointer

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            // → Data print
            temp = temp.next;
            // → Next node par move
        }

        System.out.println("null");
    }
}
