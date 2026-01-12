
    
package LinkedList;
// → Package ka naam LinkedList

public class DoublyLLAddFirst {
// → Class ka naam DoublyLLAddFirst

    Node head;
    // → DLL ka starting point

    // -------- Node class --------
    class Node {
        int data;
        Node prev;
        Node next;
        // → DLL node me data, prev aur next hota hai

        Node(int data) {
            this.data = data;
            // → Data assign kiya
            this.prev = null;
            // → Prev initially null
            this.next = null;
            // → Next initially null
        }
    }

    // -------- addFirst() --------
    public void addFirst(int data) {

        Node newNode = new Node(data);
        // → Naya node create kiya

        // agar list empty hai
        if (head == null) {
            head = newNode;
            // → Head ko newNode bana diya
            return;
        }

        newNode.next = head;
        // → New node ka next, purane head ko point karega

        head.prev = newNode;
        // → Purane head ka prev, newNode ko point karega

        head = newNode;
        // → Head ko update karke newNode bana diya
    }

    // -------- print list (forward) --------
    public void printList() {

        Node temp = head;
        // → Traversal ke liye temp pointer

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- main method --------
    public static void main(String[] args) {

        DoublyLLAddFirst dll = new DoublyLLAddFirst();

        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);

        // Final DLL: 30 <-> 20 <-> 10 <-> null
        dll.printList();
    }
}

