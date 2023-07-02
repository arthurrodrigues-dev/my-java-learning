package data_structures.LinkedList;

public class ReversingLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        Node nodeF = new Node(6);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;

        Node res = reversing(head);
        System.out.println(res.data);
    }

    static Node reversing(Node head) {

        Node next = null;
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
