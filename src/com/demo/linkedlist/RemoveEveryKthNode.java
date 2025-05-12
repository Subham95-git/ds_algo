package com.demo.linkedlist;

public class RemoveEveryKthNode {
    static Node deleteEveryKthNode(Node head, int k) {
        int count = 0;
        if (head == null || k <= 0)
            return head;

        Node curr = head;
        Node prev = null;
        while (curr != null) {
            count++;
            if (count % k == 0) {
                if(prev != null){
                    prev.next = curr.next;
                }else{
                    head = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 3 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(3);
        /*head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);*/
        System.out.println("Before");
        Util.printLinkedList(head);
        Node result = deleteEveryKthNode(head, 2);

        System.out.println("After");
        Util.printLinkedList(result);

    }
}
