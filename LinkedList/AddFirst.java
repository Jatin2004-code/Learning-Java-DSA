package LinkedList;
// → Package ka naam LinkedList hai

public class AddFirst {
// → Main class ka naam AddFirst

    // -------- Node class --------
    public static class Node {
        String data;
        Node next;
        // → Node ke paas data aur next reference hota hai

        public Node(String data) {
            this.data = data;
            // → Constructor: data assign kiya
            this.next = null;
            // → Next initially null hota hai
        }
    }

    // -------- LinkedList class --------
    public static class LL {
        public static Node head;
        // → LinkedList ka starting point

        public static Node tail;
        // → LinkedList ka last node

        // -------- addFirst() method --------
        // Time Complexity: O(1)
        public void addFirst(String data) {

            // 1. create new node
            Node newNode = new Node(data);
            // → Naya node banaya jisme given data store hoga

            // 2. if list is empty
            if (head == null) {
                head = tail = newNode;
                // → Agar LinkedList empty hai,
                // → to head aur tail dono newNode ko point karenge
                return;
            }

            // 3. newNode.next = old head
            newNode.next = head;
            // → New node ka next, purane head ko point karega

            // 4. head = newNode
            head = newNode;
            // → Head ko update karke newNode bana diya
        }

        // -------- print linked list --------
        public void print() {

            if (head == null) {
                System.out.println("LL is empty");
                // → Agar list empty ho to message print
                return;
            }

            Node temp = head;
            // → Traversal ke liye temp pointer banaya

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                // → Current node ka data print
                temp = temp.next;
                // → Next node par move
            }

            System.out.println("null");
            // → List ka end dikhane ke liye
        }
    }

    // -------- main method --------
    public static void main(String[] args) {

        LL list = new LL();
        // → LinkedList ka object banaya

        list.addFirst("is");
        // → "is" ko list ke start mein add kiya

        list.addFirst("name");
        // → "name" ko start mein add kiya

        list.addFirst("my");
        // → "my" ko start mein add kiya

        // Final LL: my -> name -> is -> null
        list.print();
        // → LinkedList print ki
    }
}
