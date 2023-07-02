package data_structures.LinkedList;

public class InsertingNodes {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtBeginning(9);
        sll.insertAtEnd(5);
        sll.insertAtEnd(6);
        sll.insertAtBeginning(2);
        sll.insertAtBeginning(5);
        sll.display();
        // System.out.println(sll);
    }
}
