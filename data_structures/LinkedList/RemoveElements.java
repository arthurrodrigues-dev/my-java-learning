package data_structures.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(6);
        Node nodeD = new Node(3);
        Node nodeE = new Node(4);
        Node nodeF = new Node(5);
        Node nodeG = new Node(6);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;
        nodeF.next = nodeG;

        int val = 6;

        Node current = head;
        Node next = current.next;
        Node noDaVez = current;

        while (current.next != null) {
            noDaVez = current;
            
            if (current.next.data == val) {
                noDaVez.next = current.next.next;
                current = current.next;
                break;
            } else {
                current = current.next;
            }
        }

        DisplayingLinkedList.display(head);
    }
}
