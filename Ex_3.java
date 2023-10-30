package lab;

class CircularLinkedList {
    Node head;

    CircularLinkedList() {
        head = null;
    }


    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }


    void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        } else {
            Node current = head;
            while (current.next != head && current.next.data != data) {
                current = current.next;
            }
            if (current.next != head) {
                current.next = current.next.next;
            }
        }
    }


    void traverse() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
public class Ex_3 {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Creation
        list.insert(1);
        list.insert(2);
        list.insert(3);

        // Traversal
        System.out.print("Circular Linked List: ");
        list.traverse();

        // Insertion
        list.insert(4);
        System.out.print("Circular Linked List after insertion: ");
        list.traverse();

        // Deletion
        list.delete(2);
        System.out.print("Circular Linked List after deletion: ");
        list.traverse();
    }
}
