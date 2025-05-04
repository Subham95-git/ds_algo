package com.demo.linkedlist;

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
}
