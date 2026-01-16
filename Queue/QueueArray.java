package Queue;
public class QueueArray {

    int arr[];
    int front;
    int rear;
    int size;

    // constructor
    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    // isEmpty
    public boolean isEmpty() {
        return rear < front;
    }

    // isFull
    public boolean isFull() {
        return rear == size - 1;
    }

    // enqueue
    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    // dequeue
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = arr[front];
        front++;
        return removed;
    }

    // peek
    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    // display
    public void display() {

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {

        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();   // 10 20 30

        q.dequeue();   // removes 10
        q.display();   // 20 30

        System.out.println(q.peek()); // 20
    }
}
