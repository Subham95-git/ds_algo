package com.demo.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(12);
        myLinkedList.append(7);
        myLinkedList.append(22);
        myLinkedList.append(5);
        myLinkedList.append(3);
        myLinkedList.append(34);
        myLinkedList.append(1);
        myLinkedList.printLinkedList();
        myLinkedList.reverse();
        myLinkedList.printLinkedList();
    }
}
