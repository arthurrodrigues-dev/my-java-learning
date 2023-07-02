package data_structures.LinkedList;

public class InsertingNodes {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(new Node(22));
        sll.insertAtBeginning(12);
        sll.insertAtBeginning(10);
        sll.insertAtEnd(99);
        sll.display();
        // System.out.println(sll);
    }
}
