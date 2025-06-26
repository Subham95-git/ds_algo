package com.demo.linkedlist.doubly;

public class InsertionInDoublyLinkedList {

    private static Node insertAtBegin(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
            head = newNode;
        }
        return head;
    }

    private static Node insertAtEnd(Node head, int value){
        Node newNode = new Node(value);
        if(head == null)
            return newNode;
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
        return head;
    }

    private static Node insertAtASpecificPosition(Node head, int value, int position){
        Node newNode = new Node(value);
        if(head == null)
            head = newNode;
        Node currentNode = head;
        for(int i=1;i<position;i++){
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        newNode.next.prev = newNode;
        currentNode.next = newNode;
        newNode.prev = currentNode;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("Initial list ");
        Util.printLinkedList(head);

        System.out.println("After inserting at the beginning");
        head = insertAtBegin(head, 11);
        Util.printLinkedList(head);

        System.out.println("After inserting at the end");
        head = insertAtEnd(head, 22);
        Util.printLinkedList(head);

        int position = 3;
        System.out.println("After inserting after position " + position);
        head = insertAtASpecificPosition(head, 33, position);
        Util.printLinkedList(head);
    }
}
