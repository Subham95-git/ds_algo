package com.demo.linkedlist.singly;

public class InsertInLinkedList {

    public static Node insertAtTheBeginning(Node node, int value) {
        Node head = node;
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtTheEnd(Node head, int value) {
        Node newNode = new Node(value);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return head;
    }

    public static Node insertAfterAGivenNode(Node head, int value, int insertAfter) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == insertAfter)
                break;
            currentNode = currentNode.next;
        }
        Node newNode = new Node(value);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }

    public static Node insertBeforeAGivenNode(Node head, int value, int insertAfter) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == insertAfter)
                break;
            currentNode = currentNode.next;
        }
        Node newNode = new Node(value);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }

    public static Node insertAfterAGivenPosition(Node head, int position, int value) {
        if (position < 1)
            return head;

        if (position == 1) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }
        Node currentNode = head;
        for (int i=1;i<position-1;i++){
            currentNode = currentNode.next;
        }
        Node newNode =  new Node(value);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 3 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        Util.printLinkedList(head);

        System.out.println("After inserting at the beginning");
        head = insertAtTheBeginning(head, 10);
        Util.printLinkedList(head);

        System.out.println("After inserting at the end");
        head = insertAtTheEnd(head, 10);
        Util.printLinkedList(head);

        System.out.println("After inserting after a given Node");
        head = insertAfterAGivenNode(head, 99, 3);
        Util.printLinkedList(head);

        System.out.println("After inserting before a given Node");
        head = insertBeforeAGivenNode(head, 99, 3);
        Util.printLinkedList(head);

        System.out.println("After inserting before a given position");
        head = insertAfterAGivenPosition(head, 2, 101);
        Util.printLinkedList(head);
    }
}
