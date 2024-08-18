package com.demo.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(3);
        myLinkedList.printLinkedList();
        myLinkedList.prepend(2);
        myLinkedList.printLinkedList();
    }
}
