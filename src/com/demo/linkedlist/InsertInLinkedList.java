package com.demo.linkedlist;

public class InsertInLinkedList {

    public static Node insertAtTheBeginning(Node node, int value){
        Node head = node;
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtTheEnd(Node node, int value){
        Node head = node;
        Node newNode = new Node(value);
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
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

    }
}
