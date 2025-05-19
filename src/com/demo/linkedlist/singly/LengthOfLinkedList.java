package com.demo.linkedlist.singly;

public class LengthOfLinkedList {
    public static int countOfLength(Node head){
        Node currentNode = head;
        int count = 0;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 3 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("length of the linked list: " + countOfLength(head));
    }
}
