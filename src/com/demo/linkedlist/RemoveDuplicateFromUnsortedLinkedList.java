package com.demo.linkedlist;

import java.util.HashSet;
import java.util.Set;


/**
 * Removes duplicate nodes from an unsorted singly linked list while preserving the original order.
 * <p>
 * This method traverses the linked list and uses a {@link HashSet} to keep track of values that have already
 * appeared. If a node's value is found in the set, the node is removed by adjusting the previous node's next pointer.
 * Otherwise, the value is added to the set and traversal continues.
 * </p>
 *
 * <b>Time Complexity:</b> O(n), where n is the number of nodes in the linked list.<br>
 * <b>Space Complexity:</b> O(n), due to the storage of unique values in the hash set.
 *
 * <pre>
 * Example:
 * Input:  12 -> 11 -> 12 -> 21 -> 41 -> 43 -> 21
 * Output: 12 -> 11 -> 21 -> 41 -> 43
 * </pre>
 */
public class RemoveDuplicateFromUnsortedLinkedList {
    private static Node removeDuplicateNode(Node head) {
        Set<Integer> uniqueNode = new HashSet<>();
        Node currentNode = head;
        Node prev = null;
        while (currentNode != null) {
            if (uniqueNode.contains(currentNode.value)) {
                prev.next = currentNode.next;
            } else {
                uniqueNode.add(currentNode.value);
                prev = currentNode;
            }
            currentNode = currentNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Create a singly linked list:
        // 12 -> 11 -> 12 -> 21 -> 41 -> 43 -> 21
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(21);

        System.out.println("Before removing duplicate");
        Util.printLinkedList(head);

        System.out.println("After removing duplicate");
        Util.printLinkedList(removeDuplicateNode(head));
    }
}
