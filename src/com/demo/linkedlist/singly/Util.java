package com.demo.linkedlist.singly;

public class Util {
    public static void printLinkedList(Node node) {
        if (node != null) {
            while (node != null) {
                System.out.printf("( %d )->", node.value);
                node = node.next;
            }
        }
        System.out.println();
    }

    public static Node createLinkedList(Node head, int value){
        Node currentNode = head;
        Node newNode = new Node(value);
        if(currentNode == null)
            return newNode;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return head;
    }
}
