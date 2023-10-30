package lab;
class StackArray {
    private int maxSize;
    private int top;
    private int[] stack;

    public StackArray(int size) {
        maxSize = size;
        top = -1;
        stack = new int[maxSize];
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Error value
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Error value
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
public class Ex_4_1 {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        stack.push(4);
        stack.push(5);
        System.out.println("Is Full? " + stack.isFull());

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("Is Empty? " + stack.isEmpty());
    }
}
