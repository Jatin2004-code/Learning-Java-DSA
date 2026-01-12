package LinkedList;
// → Package ka naam LinkedList

public class DoublyLLRemoveLast {
// → Class ka naam DoublyLLRemoveLast

    Node head;
    // → DLL ka starting point (head)

    // -------- Node class --------
    class Node {
        int data;
        Node prev;
        Node next;
        // → Doubly LL node me data, prev aur next hota hai

        Node(int data) {
            this.data = data;
            // → Data assign kiya
            this.prev = null;
            // → Prev initially null
            this.next = null;
            // → Next initially null
        }
    }

    // -------- addFirst (helper, taaki list ban sake) --------
    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // -------- removeLast() --------
    public void removeLast() {

        // case 1: agar list empty hai
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }

        // case 2: agar sirf ek hi node hai
        if (head.next == null) {
            head = null;
            // → Single node delete ho gaya
            return;
        }

        Node temp = head;
        // → Traversal ke liye temp pointer

        // last node tak pahunchna
        while (temp.next != null) {
            temp = temp.next;
        }

        // ab temp last node par hai
        temp.prev.next = null;
        // → Second-last node ka next null kar diya
        // → Last node remove ho gaya
    }

    // -------- print list --------
    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- main method --------
    public static void main(String[] args) {

        DoublyLLRemoveLast dll = new DoublyLLRemoveLast();

        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        // DLL: 30 <-> 20 <-> 10 <-> null

        dll.printList();

        dll.removeLast();
        // → Last node (10) remove

        dll.printList();
        // → 30 <-> 20 <-> null
    }
}
