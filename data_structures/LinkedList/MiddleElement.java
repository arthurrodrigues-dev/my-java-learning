package data_structures.LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        // Node nodeF = new Node(6);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        // nodeE.next = nodeF;

        int amountOfNodes = 1;
        Node current = head;
        while (current.next != null) {
            amountOfNodes++;
            current = current.next;
        }

        int i = 0;
        Node middleNode = null;
        current = head;

        while (i != (amountOfNodes / 2)) {
            current = current.next;
            middleNode = current;
            i++;
        }
       
        System.out.println(middleNode.data);
        
    }
}
