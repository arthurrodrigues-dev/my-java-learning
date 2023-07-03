package data_structures.LinkedList;

public class FindingElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node nodeB = new Node(6);
        Node nodeC = new Node(6);
        Node nodeD = new Node(3);
        Node nodeE = new Node(6);
        Node nodeF = new Node(5);
        Node nodeG = new Node(6);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;
        nodeF.next = nodeG;

        Node find3 = head;
        Node current = head.next;
        boolean found = false;

        while (!found) {
            if (current.data == 6) {
                current = current.next;
            } else {
                find3 = current;
                found = true;
            }
        }

        System.out.println(find3.data);

    }
}
