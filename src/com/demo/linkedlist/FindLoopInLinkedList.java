package com.demo.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Checks if a singly linked list contains a loop (cycle).
 * <p>
 * This method traverses the linked list and uses a HashSet to keep track of visited nodes.
 * If a node is encountered that is already present in the HashSet, a cycle exists in the list.
 * If the end of the list (null) is reached, there is no cycle.
 * </p>
 *
 * <p>
 * <b>Examples:</b>
 * <pre>
 * Input: 1 -> 3 -> 4 -> 3 (cycle back to node with value 3)
 * Output: true
 *
 * Input: 1 -> 8 -> 3 -> 4 -> NULL
 * Output: false
 * </pre>
 * </p>
 */
public class FindLoopInLinkedList {
    public static boolean isThereALoop(Node head){
        Set<Node> uniqueNodes = new HashSet<>();
        while (head!= null){
            if(uniqueNodes.contains(head))
                return true;
            uniqueNodes.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 3-> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        // Create a loop
        head.next.next.next = head.next;

        System.out.println("Is there a loop? " + isThereALoop(head));
    }
}
