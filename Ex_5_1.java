package lab;
class QueueArray {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;

    public QueueArray(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queue = new int[maxSize];
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queue[rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Error value
        }
        int value = queue[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Error value
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isFull() {
        return (rear + 2) % maxSize == front;
    }
}
public class Ex_5_1 {public static void main(String[] args) {
    QueueArray queue = new QueueArray(5);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    System.out.println("Peek: " + queue.peek());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("Peek: " + queue.peek());

    queue.enqueue(4);
    queue.enqueue(5);
    System.out.println("Is Full? " + queue.isFull());

    while (!queue.isEmpty()) {
        System.out.print(queue.dequeue() + " ");
    }
    System.out.println("Is Empty? " + queue.isEmpty());
}
}
