package com.demo.linkedlist.singly;


/**
 * Finds the length of the loop in the linked list, if present.
 *
 * <p>This method uses Floyd’s Cycle Detection Algorithm (Tortoise and Hare approach) to detect a loop.
 * If a loop is detected, it counts the number of nodes in the loop by traversing from the meeting point
 * until it returns to the same node. If no loop is present, it returns 0.</p>
 *
 *
 * <pre>
 * Example 1:
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> 2
 * (cycle of length 4)
 * Output: 4
 *
 * Example 2:
 * Input: 25 -> 14 -> 19 -> 33 -> 10 -> 21 -> 39 -> 90 -> 58 -> 45 -> 33
 * (cycle of length 7)
 * Output: 7
 *
 * Example 3:
 * Input: 4 -> 3 -> 7 -> 9 -> 2 (no cycle)
 * Output: 0
 * </pre>
 */
public class FindLengthOfALoopInLinkedListFloyd {
    private static int getLengthOfALoop(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return countLength(fast);
        }
        return -1;
    }

    private static int countLength(Node node) {
        int count = 0;
        Node currentNode = node;
        while (currentNode.next != node) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Loop from 5 to 2
        head.next.next.next.next.next = head.next;

        int lengthOfNode = getLengthOfALoop(head);
        System.out.println(lengthOfNode);
    }

}
