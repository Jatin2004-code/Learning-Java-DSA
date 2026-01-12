package LinkedList;
// → Package ka naam LinkedList

public class ReverseLinkedList {
// → Class ka naam ReverseLinkedList

    Node head;
    // → LinkedList ka starting point (head)

    Node tail;
    // → LinkedList ka last node

    int size;
    // → LinkedList ka size

    // -------- Node class --------
    class Node {
        int data;
        Node next;
        // → Node me data aur next reference hota hai

        Node(int data) {
            this.data = data;
            // → Data assign kiya
            this.next = null;
            // → Next initially null
        }
    }

    // -------- addLast() --------
    public void addLast(int data) {

        Node newNode = new Node(data);
        // → Naya node create kiya

        if (head == null) {
            head = tail = newNode;
            // → Agar list empty hai to head aur tail dono newNode
        } else {
            tail.next = newNode;
            // → Purane tail ka next newNode ko point karega
            tail = newNode;
            // → Tail update
        }

        size++;
        // → Size increase
    }

    // -------- REVERSE LINKED LIST --------
    public void reverse() {

        Node prev = null;
        // → Prev pointer (initially null)

        Node curr = head;
        // → Curr pointer head se start

        Node next;
        // → Next pointer (temporary)

        while (curr != null) {
            // → Jab tak list khatam na ho

            next = curr.next;
            // → Next node ko save kar liya

            curr.next = prev;
            // → Current node ka link reverse kar diya

            prev = curr;
            // → Prev ko aage move kiya

            curr = next;
            // → Curr ko aage move kiya
        }

        head = prev;
        // → Head ko update karke last node bana diya
    }

    // -------- print list --------
    public void printList() {

        Node temp = head;
        // → Traversal ke liye temp pointer

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- main method --------
    public static void main(String[] args) {

        ReverseLinkedList ll = new ReverseLinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // → LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.printList();

        ll.reverse();
        // → LinkedList reverse kar di

        ll.printList();
        // → Output: 5 -> 4 -> 3 -> 2 -> 1 -> null
    }
}
