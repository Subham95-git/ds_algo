package com.demo.linkedlist.singly;

/**
 * <li>Given a singly linked list, the task is to remove every kth node of
 * the linked list. Assume that k is always less than or equal to the length of the Linked List.</li>
 *
 * <li>
 * <p>
 * Input: LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 2
 * Output: 1 -> 3 -> 5
 * Explanation: After removing every 2nd node of the linked list, the resultant
 * linked list will be: 1 -> 3 -> 5 .</li>
 *
 *
 * <li>Input: LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10, k = 3
 * Output: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10
 * Explanation: After removing every 3rd node of the linked list, the resultant
 * linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.</li>
 *
 * <li>The idea is to traverse the linked list while maintaining a counter to
 * track node positions. Every time the counter reaches k, update the next pointer
 * of the previous node to skip the current kth node, effectively removing it from the list.
 * Continue this process until reaching the end of the list. This method ensures that the
 * kth nodes are removed as required while preserving the rest of the list structure.</li>
 */
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
                if (prev != null) {
                    prev.next = curr.next;
                } else {
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
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println("Before");
        Util.printLinkedList(head);
        Node result = deleteEveryKthNode(head, 2);

        System.out.println("After");
        Util.printLinkedList(result);

    }
}
