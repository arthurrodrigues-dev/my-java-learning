package data_structures.LinkedList;

public class DisplayingLinkedList {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);

        head.next = nodeA;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        
        display(head);
    }

    static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        } 
        System.out.print("null");
    }
}
