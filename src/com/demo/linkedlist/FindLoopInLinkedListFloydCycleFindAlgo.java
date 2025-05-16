package com.demo.linkedlist;

/**
 * Checks if the given singly linked list has a loop (cycle).
 *
 * <p>This method uses Floyd's Cycle-Finding Algorithm, also known as the Tortoise and Hare algorithm.
 * It uses two pointers moving at different speeds. If the linked list contains a cycle,
 * the fast pointer will eventually meet the slow pointer.</p>
 *
 * <pre>
 * Example 1:
 * Input: 1 -> 3 -> 4 -> 3 (cycle)
 * Output: true
 *
 * Example 2:
 * Input: 1 -> 8 -> 3 -> 4 -> null (no cycle)
 * Output: false
 * </pre>
 */
public class FindLoopInLinkedListFloydCycleFindAlgo {
    private static boolean isThereALoop(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow)
                return true;
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
