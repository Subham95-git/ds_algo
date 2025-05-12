package com.demo.linkedlist;

public class NthNodeFromEnd {

    public static int findNthFromEnd(Node head, int N) {
        int nodeLength = 0;
        Node currentNode = head;
        while (currentNode != null){
            nodeLength ++;
            currentNode = currentNode.next;
        }

        if(nodeLength < N)
            return -1;

        currentNode = head;

        for(int i = 1; i< nodeLength - N + 1; i++){
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        int nodeValue = findNthFromEnd(head, 4);
        if(nodeValue == -1)
            System.out.println("No node found");
        else
            System.out.println(nodeValue);
    }
}
