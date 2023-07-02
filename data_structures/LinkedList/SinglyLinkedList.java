package data_structures.LinkedList;

public class SinglyLinkedList {
    Node head;

    SinglyLinkedList(Node head) {
        this.head = head;
    }

    SinglyLinkedList() {
        return;
    }

    void insertAtBeginning(int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode; 
    }

    void insertAtEnd(int x) {
        Node newnode = new Node(x);
        Node current = head;

        if (head == null) {
            head = newnode;
            return;
        }

        while (null != current.next) {
            current = current.next;
        }
        current.next = newnode;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
