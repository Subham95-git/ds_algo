package com.demo.linkedlist;

public class NthNodeFromStart {
    public static int findNthNodeFromStart(Node head, int N) {
        Node currentNode = head;
        int count = 1;
        while (currentNode != null) {
            if( count == N)
                return currentNode.value;

            count++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        int nodeValue = findNthNodeFromStart(head, 3);
        if(nodeValue == -1)
            System.out.println("No node found");
        else
            System.out.println(nodeValue);
    }
}
