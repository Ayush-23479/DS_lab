package lab;
class CircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;

    public CircularQueue(int size) {
        maxSize = size;
        front = rear = -1;
        queue = new int[maxSize];
    }

    public boolean isFull() {
        if (front == 0 && rear == maxSize - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        if (front == -1) {
            front = 0;
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
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % maxSize;
        }
        return value;
    }
}
public class Ex_6_1 {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}
