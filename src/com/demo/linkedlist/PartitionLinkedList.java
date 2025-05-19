package com.demo.linkedlist;

/**
 * Partitions a linked list around a value {@code x}, such that all nodes less than {@code x} come first,
 * followed by nodes equal to {@code x}, and then nodes greater than {@code x}.
 * <p>
 * The original relative order of the nodes in each partition is preserved.
 * This is achieved by using three separate lists (less, equal, greater) and connecting them at the end.
 * </p>
 *
 * <b>Approach:</b><br>
 * Three dummy nodes are used to build three partitions. As the original list is traversed, each node is appended
 * to the appropriate partition. Finally, the three partitions are concatenated to form the result.
 *
 * <b>Time Complexity:</b> O(n), where n is the number of nodes in the list.<br>
 * <b>Space Complexity:</b> O(1), as no extra space proportional to input size is used (apart from pointers).
 *
 *
 * <h3>Examples:</h3>
 * <pre>
 * Input:  1 -> 4 -> 3 -> 2 -> 5 -> 2 -> 3, x = 3
 * Output: 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> 5
 *
 * Input:  10 -> 4 -> 20 -> 10 -> 3, x = 3
 * Output: 3 -> 10 -> 4 -> 20 -> 10
 * </pre>
 */
public class PartitionLinkedList {
    private static Node doPartition(Node head, int partitionValue) {
        Node lessHead = new Node(0);
        Node equalHead = new Node(0);
        Node greaterHead = new Node(0);

        Node less = lessHead;
        Node equal = equalHead;
        Node greater = greaterHead;

        Node curr = head;
        while (curr != null) {
            if (curr.value < partitionValue) {
                less.next = new Node(curr.value);
                less = less.next;
            } else if (curr.value == partitionValue) {
                equal.next = new Node(curr.value);
                equal = equal.next;
            } else if (curr.value > partitionValue) {
                greater.next = new Node(curr.value);
                greater = greater.next;
            }
            curr = curr.next;
        }
        less.next = equalHead.next;
        equal.next = greaterHead.next;
        greater.next = null;
        return lessHead.next;
    }

    public static void main(String[] args) {
        // Creating the linked list: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);
        System.out.println("Before Partition");
        Util.printLinkedList(head);

        int x = 3;
        head = doPartition(head, x);
        System.out.println("After Partition");
        Util.printLinkedList(head);
    }
}
