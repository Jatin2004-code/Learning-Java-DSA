
package LinkedList;
// → Package ka naam LinkedList

public class RemoveNthFromEnd {
// → Class ka naam RemoveNthFromEnd

    Node head;
    // → LinkedList ka starting point

    int size;
    // → LinkedList ka size

    // -------- Node class --------
    class Node {
        int data;
        Node next;
        // → Node me data aur next reference hota hai

        Node(int data) {
            this.data = data;
            // → Data assign
            this.next = null;
            // → Next initially null
        }
    }

    // -------- addLast (helper) --------
    public void addLast(int data) {

        Node newNode = new Node(data);
        // → Naya node banaya

        if (head == null) {
            head = newNode;
            // → Agar list empty hai to head = newNode
        } else {
            Node temp = head;
            // → Traversal pointer

            while (temp.next != null) {
                temp = temp.next;
                // → Last node tak jao
            }

            temp.next = newNode;
            // → Last node ke baad newNode jod diya
        }

        size++;
        // → Size increase
    }

    // -------- REMOVE Nth NODE FROM END --------
    public void removeNthFromEnd(int n) {

        // case 1: agar list empty hai
        if (head == null) {
            return;
        }

        // case 2: agar nth node from end = head
        if (n == size) {
            head = head.next;
            // → Head ko remove kar diya
            size--;
            return;
        }

        int idxToFind = size - n;
        // → Start se jis index par node delete karni hai

        Node prev = head;
        // → Previous node tak pahunchne ke liye

        for (int i = 1; i < idxToFind; i++) {
            prev = prev.next;
            // → Prev ko aage badhao
        }

        prev.next = prev.next.next;
        // → Nth node ko bypass kar diya (delete)

        size--;
        // → Size decrease
    }

    // -------- print list --------
    public void printList() {

        Node temp = head;
        // → Traversal pointer

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- main method --------
    public static void main(String[] args) {

        RemoveNthFromEnd ll = new RemoveNthFromEnd();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // → LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.printList();

        ll.removeNthFromEnd(3);
        // → End se 3rd node remove (node = 3)

        ll.printList();
        // → Output: 1 -> 2 -> 4 -> 5 -> null
    }
}
