package LinkedList;
// → Package ka naam LinkedList

public class SearchRecursive {
// → Class ka naam SearchRecursive

    Node head;
    // → LinkedList ka starting point

    int size;
    // → LinkedList ka size

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

    // -------- RECURSIVE SEARCH (helper function) --------
    private int searchRec(Node temp, int key, int idx) {
        // → temp = current node
        // → key = search karne wali value
        // → idx = current index

        if (temp == null) {
            return -1;
            // → Base case: list khatam, key nahi mili
        }

        if (temp.data == key) {
            return idx;
            // → Key mil gayi, index return
        }

        return searchRec(temp.next, key, idx + 1);
        // → Next node ke liye recursive call
    }

    // -------- PUBLIC METHOD --------
    public int search(int key) {
        return searchRec(head, key, 0);
        // → Recursive search head se start
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

        SearchRecursive ll = new SearchRecursive();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // → LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.printList();

        int key = 3;
        // → Search karne wali value

        System.out.println("Key found at index: " + ll.search(key));
        // → Output: 2
    }
}
