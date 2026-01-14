package Stack;

public class LinkedListStack {
    

    // -------- Node class --------
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // top of stack
    static Node top = null;

    // -------- isEmpty() --------
    public static boolean isEmpty() {
        return top == null;
    }

    // -------- push() --------
    public static void push(int data) {

        Node newNode = new Node(data);
        // → Naya node banaya

        newNode.next = top;
        // → New node ka next purane top ko point karega

        top = newNode;
        // → Top ko update kar diya
    }

    // -------- pop() --------
    public static int pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = top.data;
        // → Top element save kiya

        top = top.next;
        // → Top ko next node par shift kar diya

        return popped;
    }

    // -------- peek() --------
    public static int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // -------- main method --------
    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);

        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }
    }
}

