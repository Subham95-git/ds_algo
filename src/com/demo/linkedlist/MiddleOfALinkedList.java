package com.demo.linkedlist;

/**
 * <p>Given a singly linked list, the task is to find the middle of the linked list.
 * If the number of nodes are even, then there would be two middle nodes, so return
 * the second middle node.
 *
 * Example:
 *
 * Input: linked list: 1->2->3->4->5
 * Output: 3
 * Explanation: There are 5 nodes in the linked list and there is one middle node whose value is 3.
 *
 *
 * Input: linked list = 10 -> 20 -> 30 -> 40 -> 50 -> 60
 * Output: 40
 * Explanation: There are 6 nodes in the linked list, so we have two middle nodes: 30 and 40,
 * but we will return the second middle node which is 40.</p>
 *
 *
 * <p>The idea is to traversing the entire linked list once to count the total number of nodes.
 * After determining the total count, traverse the list again and stop at the (count/2)th node
 * to return its value. This method requires two passes through the linked list to find the middle element.</p>
 */

public class MiddleOfALinkedList {
    private static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private static int getMiddleOfANode(Node head) {
        int nodeLength = getLength(head);
        int middleIndex = nodeLength/2;

        while (middleIndex>0){
            head = head.next;
            middleIndex--;
        }
        return head.value;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddleOfANode(head));
    }
}
