package linkedList;

public class LinkedList {

    public static Node getLinkedList() {
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        node1.setNext(node2);
        Node node3 = new Node(11);
        node2.setNext(node3);
        Node node4 = new Node(13);
        node3.setNext(node4);
        Node node5 = new Node(22);
        node4.setNext(node5);
        node5.setNext(null);
        return node1;
    }

    // печать односвязанного списка
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.getValue() + "  ");
            head = head.getNext();
        }
    }

    // реверсировать односвязанный список
    public static Node reverseLinkedList(Node head) {
        if (head == null) return null;
        if (head.getNext() == null) return head;
        Node prev = head;
        Node next = head.getNext();
        prev.setNext(null);
        while (next != null) {
            head = next;
            next = next.getNext();
            head.setNext(prev);
            prev = head;
        }
        return head;
    }
}
