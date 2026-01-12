package LinkedList;
// → Package ka naam LinkedList

public class DoublyLLReverse {
// → Class ka naam DoublyLLReverse

    Node head;
    // → DLL ka starting point (head)

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

    // -------- addFirst (helper) --------
    public void addFirst(int data) {

        Node newNode = new Node(data);
        // → Naya node banaya

        if (head == null) {
            head = newNode;
            // → Agar list empty hai
            return;
        }

        newNode.next = head;
        // → New node ka next purane head ko point karega

        head.prev = newNode;
        // → Purane head ka prev newNode ko point karega

        head = newNode;
        // → Head update
    }

    // -------- REVERSE DOUBLY LINKED LIST --------
    public void reverse() {

        Node curr = head;
        // → Curr pointer head se start

        Node temp = null;
        // → Temporary pointer (swap ke liye)

        // poori list traverse
        while (curr != null) {

            // prev aur next ko swap karo
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // next node par move (actually prev ki taraf)
            curr = curr.prev;
        }

        // head update
        if (temp != null) {
            head = temp.prev;
            // → Naya head last node ban jaata hai
        }
    }

    // -------- print list --------
    public void printList() {

        Node temp = head;
        // → Traversal ke liye temp

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- main method --------
    public static void main(String[] args) {

        DoublyLLReverse dll = new DoublyLLReverse();

        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addFirst(40);
        // DLL: 40 <-> 30 <-> 20 <-> 10 <-> null

        dll.printList();

        dll.reverse();
        // → DLL reverse ho gayi

        dll.printList();
        // → 10 <-> 20 <-> 30 <-> 40 <-> null
    }
}

