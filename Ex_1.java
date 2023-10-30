package lab;


class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }


    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
        } else {
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Ex_1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creation
        list.insert(1);
        list.insert(2);
        list.insert(3);

        // Traversal
        System.out.print("Linked List: ");
        list.traverse();

        // Insertion
        list.insert(4);
        System.out.print("Linked List after insertion: ");
        list.traverse();

        // Deletion
        list.delete(2);
        System.out.print("Linked List after deletion: ");
        list.traverse();
    }
}
