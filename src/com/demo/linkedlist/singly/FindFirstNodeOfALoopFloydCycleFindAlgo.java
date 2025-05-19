package com.demo.linkedlist.singly;


/**
 * Finds the starting node of the loop in a singly linked list, if present.
 *
 * <p>This method first detects if a loop exists in the linked list using Floyd’s Cycle-Finding Algorithm
 * (Tortoise and Hare approach). If a loop is detected, it then finds the starting node of the loop by
 * resetting one pointer to the head and moving both pointers one step at a time until they meet.
 * The meeting point is the starting node of the loop.</p>
 *
 *
 * <pre>
 * Example 1:
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle starts at node with value 3)
 * Output: 3
 *
 * Example 2:
 * Input: 1 -> 2 -> 3 -> 4 -> null (no cycle)
 * Output: -1
 * </pre>
 */
public class FindFirstNodeOfALoopFloydCycleFindAlgo {
    private static Node getFirstNodeOfALoop(Node head) {
        Node fast = head;
        Node slow = head;
        boolean isLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                isLoop = true;
                break;
            }
        }
        if (isLoop) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 3-> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        // Create a loop
        head.next.next.next = head.next;

        Node firstNodeOfLoop = getFirstNodeOfALoop(head);
        if (firstNodeOfLoop != null) {
            System.out.println(firstNodeOfLoop.value);
        } else {
            System.out.println("No loop");
        }
    }
}
