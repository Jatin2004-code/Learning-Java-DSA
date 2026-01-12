package LinkedList;// → Package ka naam LinkedList hai

public class RemoveLast {
// → Class ka naam RemoveLast

    Node head;
    // → LinkedList ka first node

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

    // -------- removeLast() function --------
    public void removeLast() {

        // case 1: agar list empty hai
        if (head == null) {
            System.out.println("LinkedList is empty");
            // → Remove karne ke liye kuch hai hi nahi
            return;
        }

        // case 2: agar sirf ek hi element hai
        if (size == 1) {
            head = tail = null;
            // → Head aur tail dono null kar diye
            size = 0;
            return;
        }

        Node prev = head;
        // → Prev pointer banaya jo second-last node tak jayega

        // second-last node tak pahunchna
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
            // → Next node par move
        }

        prev.next = null;
        // → Last node ka link tod diya

        tail = prev;
        // → Tail ko update karke prev bana diya

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
