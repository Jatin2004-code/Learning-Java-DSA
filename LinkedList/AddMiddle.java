package LinkedList;

public class AddMiddle {

    // -------- NODE CLASS --------
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    // → LinkedList ka starting point (head)

    // -------- ADD AT INDEX (MIDDLE) --------
    public void add(int idx, int data) {

        Node newNode = new Node(data);
        // → Naya node banaya jisme data store hoga

        Node temp = head;
        // → temp pointer ko head par rakha

        int i = 0;
        // → index counter

        while (i < idx - 1) {
            // → jab tak idx-1 position par na pahunch jaaye

            temp = temp.next;
            // → next node par move karo

            i++;
            // → counter increase
        }

        // ab temp prev node par hai (idx-1)

        newNode.next = temp.next;
        // → newNode ka next, temp ke next ko point karega

        temp.next = newNode;
        // → temp ka next ab newNode ko point karega
    }

    // -------- PRINT LINKED LIST --------
    public void print() {

        Node temp = head;
        // → traversal ke liye temp pointer

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        AddMiddle ll = new AddMiddle();

        ll.head = ll.new Node(10);
        ll.head.next = ll.new Node(20);
        ll.head.next.next = ll.new Node(30);
        ll.head.next.next.next = ll.new Node(40);

        ll.print();
        // → 10 -> 20 -> 30 -> 40 -> null

        ll.add(2, 25);
        // → index 2 par 25 insert karna

        ll.print();
        // → 10 -> 20 -> 25 -> 30 -> 40 -> null
    }
}
