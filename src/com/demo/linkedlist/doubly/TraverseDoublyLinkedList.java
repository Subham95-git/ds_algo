package com.demo.linkedlist.doubly;

public class TraverseDoublyLinkedList {
    private static void forwardTraverse(Node head){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.value + " <---> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    private static void backwardTraverse(Node tail){
        Node currentNode = tail;
        while (currentNode != null){
            System.out.print(currentNode.value + " <---> ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        forwardTraverse(head);
        backwardTraverse(third);
    }
}