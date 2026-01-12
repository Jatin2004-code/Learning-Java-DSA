package LinkedList;


public class MergeSortLL {

    Node head;
    // → LinkedList ka starting point

    // -------- Node class --------
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -------- addLast() --------
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // -------- MERGE SORT --------
    public Node mergeSort(Node head) {

        // base case
        if (head == null || head.next == null) {
            return head;
            // → single node already sorted
        }

        // step 1: find middle
        Node mid = getMid(head);

        Node rightHead = mid.next;
        // → right half ka head

        mid.next = null;
        // → left aur right list separate kar di

        // step 2: recursive calls
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // step 3: merge
        return merge(left, right);
    }

    // -------- FIND MID (slow-fast) --------
    private Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        // → slow middle node par hota hai
    }

    // -------- MERGE TWO SORTED LISTS --------
    private Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        // → temporary dummy node

        Node temp = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        // remaining nodes
        if (head1 != null) {
            temp.next = head1;
        }

        if (head2 != null) {
            temp.next = head2;
        }

        return dummy.next;
        // → merged sorted list ka head
    }

    // -------- print list --------
    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- main method --------
    public static void main(String[] args) {

        MergeSortLL ll = new MergeSortLL();

        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(8);
        ll.addLast(2);
        ll.addLast(1);

        // Before sorting
        ll.printList(ll.head);

        ll.head = ll.mergeSort(ll.head);
        // → merge sort applied

        // After sorting
        ll.printList(ll.head);
    }
}

