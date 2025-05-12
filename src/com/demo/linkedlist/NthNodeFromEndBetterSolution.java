package com.demo.linkedlist;

public class NthNodeFromEndBetterSolution {
    public static int findNthNodeFromEnd(Node head, int N) {
        Node main_ptr = head, ref_ptr = head;

        for (int i = 1; i < N; i++) {
            ref_ptr = ref_ptr.next;
            if (ref_ptr == null)
                return -1;
        }
        while (ref_ptr.next != null){
            main_ptr = main_ptr.next;
            ref_ptr = ref_ptr.next;
        }
        return main_ptr.value;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        int nodeValue = findNthNodeFromEnd(head, 4);
        if(nodeValue == -1)
            System.out.println("No node found");
        else
            System.out.println(nodeValue);
    }
}
