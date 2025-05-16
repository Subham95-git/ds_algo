package com.demo.linkedlist;


/**
 * Removes the loop from the linked list, if present.
 *
 * <p>This method first detects if a loop exists in the linked list using Floyd’s Cycle-Finding Algorithm
 * (Tortoise and Hare approach). If a loop is detected, it finds the node just before the start of the loop
 * and sets its next pointer to null, thereby removing the loop.</p>
 *
 * <pre>
 * Example 1:
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle starts at node with value 3)
 * Output: 1 -> 2 -> 3 -> 4 -> 5 -> null
 *
 * Example 2:
 * Input: 1 -> 2 -> 3 -> 4 -> null (no cycle)
 * Output: 1 -> 2 -> 3 -> 4 -> null
 * </pre>
 */
public class FindAndRemoveALoopFloydAlgo {
    public static void findAndDeleteLoop(Node head) {
        if(head == null || head.next == null){
            return;
        }
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
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 3-> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        // Create a loop
        head.next.next.next = head.next;

        findAndDeleteLoop(head);
        Util.printLinkedList(head);
    }
}
