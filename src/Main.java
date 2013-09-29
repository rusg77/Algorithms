import linkedList.LinkedList;
import linkedList.Node;

public class Main {

    public static void main(String[] args) {
        Node head = LinkedList.getLinkedList();
        LinkedList.printLinkedList(head);

        Node reversed_head = LinkedList.reverseLinkedList(head);
        System.out.print("\nreversed: ");
        LinkedList.printLinkedList(reversed_head);


    }
}
