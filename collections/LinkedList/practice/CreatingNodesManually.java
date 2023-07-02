package collections.LinkedList.practice;

public class CreatingNodesManually {
    public static void main(String[] args) {

        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(10);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(countNodes(head));

    }

    static int countNodes(Node head) {
        // assuming that head != null
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        
        return count;
    }
}
