package Queue;

public class QueueLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // isEmpty
    public boolean isEmpty() {
        return front == null;
    }

    // enqueue
    public void enqueue(int data) {

        Node newNode = new Node(data);

        // first element
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // dequeue
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = front.data;
        front = front.next;

        // if queue becomes empty
        if (front == null) {
            rear = null;
        }

        return removed;
    }

    // peek
    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    // display
    public void display() {

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // main
    public static void main(String[] args) {

        QueueLL q = new QueueLL();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // 10 20 30

        q.dequeue(); // remove 10
        q.display(); // 20 30

        System.out.println(q.peek()); // 20
    }
}

