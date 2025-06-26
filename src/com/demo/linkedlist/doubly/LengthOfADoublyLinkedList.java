package com.demo.linkedlist.doubly;

public class LengthOfADoublyLinkedList {
    private static int getLength(Node head){
        Node currentNode = head;
        int length = 0;
        while (currentNode != null){
            currentNode = currentNode.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println(getLength(head));
    }
}
