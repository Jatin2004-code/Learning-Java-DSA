
package LinkedList;
// → Package ka naam LinkedList

public class SearchIterative {
// → Class ka naam SearchIterative

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

    // -------- addLast (helper method) --------
    public void addLast(int data) {

        Node newNode = new Node(data);
        // → Naya node banaya

        if (head == null) {
            head = newNode;
            // → Agar list empty hai to head = newNode
        } else {
            Node temp = head;
            // → Traversal ke liye temp

            while (temp.next != null) {
                temp = temp.next;
                // → Last node tak jao
            }

            temp.next = newNode;
            // → Last node ke baad newNode jod do
        }

        size++;
        // → Size increase
    }

    // -------- SEARCH (ITERATIVE) --------
    public int search(int key) {

        Node temp = head;
        // → Traversal ke liye temp pointer

        int idx = 0;
        // → Index counter (0-based)

        while (temp != null) {
            // → Jab tak list khatam na ho

            if (temp.data == key) {
                return idx;
                // → Key mil gayi, index return
            }

            temp = temp.next;
            // → Next node par move

            idx++;
            // → Index increase
        }

        return -1;
        // → Agar key nahi mili
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

        SearchIterative ll = new SearchIterative();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // → LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.printList();

        int key = 4;
        // → Search karne wali value

        System.out.println("Key found at index: " + ll.search(key));
        // → Output: 3
    }
}
