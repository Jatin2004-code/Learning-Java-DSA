package Queue;
public class CircularQueue {

    int arr[];
    int front;
    int rear;
    int size;

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // isEmpty
    public boolean isEmpty() {
        return front == -1;
    }

    // isFull
    public boolean isFull() {
        return (front == (rear + 1) % size);
    }

    // enqueue
    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // dequeue
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return removed;
    }

    // display
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();   // 10 20 30 40

        q.dequeue();   // remove 10
        q.dequeue();   // remove 20

        q.enqueue(50);
        q.enqueue(60);

        q.display();   // 30 40 50 60
    }
}

