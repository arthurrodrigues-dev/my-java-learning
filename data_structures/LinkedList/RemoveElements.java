package data_structures.LinkedList;

public class RemoveElements {
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

        Node dummy = head;
        Node prev = dummy;
        Node curr = head;

        int val = 6;
        while (curr != null) {
            Node next = curr.next;

            if (curr.data == val){
                prev.next = next;
            } else {
                prev = curr;
            }

            curr = next;
        }


        DisplayingLinkedList.display(head);
    }
}
