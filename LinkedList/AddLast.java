package LinkedList;
// → Package ka naam LinkedList hai

public class AddLast {
// → Class ka naam AddLast

    Node head;
    // → LinkedList ka first node (starting point)

    Node tail;
    // → LinkedList ka last node

    int size;
    // → LinkedList ka total size store karega

    // -------- Node class --------
    class Node {
        int data;
        Node next;
        // → Har node me data aur next reference hota hai

        Node(int data) {
            this.data = data;
            // → Constructor me data assign kiya
            this.next = null;
            // → Next initially null hota hai
        }
    }

    // -------- addLast() function --------
    public void addLast(int data) {

        Node newNode = new Node(data);
        // → Naya node create kiya jisme data store hoga

        // agar list empty hai
        if (head == null) {
            head = newNode;
            // → Head ko newNode par point kar diya

            tail = newNode;
            // → Tail bhi newNode ban gaya
        } else {
            // tail ke baad new node jodega
            tail.next = newNode;
            // → Purane tail ka next, newNode ko point karega

            tail = newNode;
            // → Tail ko update karke newNode bana diya
        }

        size++;
        // → Har insertion ke baad size increase
    }

    // -------- print / display --------
    public void printList() {

        Node temp = head;
        // → Traversal ke liye temp pointer banaya

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            // → Current node ka data print

            temp = temp.next;
            // → Next node par move
        }

        System.out.println("null");
        // → LinkedList ka end show karta hai
    }
}
