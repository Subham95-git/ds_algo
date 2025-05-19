package com.demo.linkedlist;


/**
 * Creates and returns a new singly linked list representing the intersection of two sorted linked lists.
 * <p>
 * This method traverses both input lists in parallel, comparing their current nodes.
 * If a common element is found, a new node is created and appended to the result list.
 * The result list is built at its tail using a reference to the last node's {@code next} pointer,
 * avoiding the need for a dummy node. The original input lists are not modified.
 * </p>
 *
 * <b>Approach:</b>
 * Instead of using a dummy node, this solution maintains a reference to the last pointer of the result list,
 * allowing efficient appending and handling of the empty list case.
 *
 * <b>Time Complexity:</b> O(m + n), where m and n are the lengths of the input lists.<br>
 * <b>Space Complexity:</b> O(k), where k is the number of common elements.
 *
 *
 * <h3>Examples:</h3>
 * <pre>
 * Input:
 *   First linked list: 1->2->3->4->6
 *   Second linked list: 2->4->6->8
 * Output: 2->4->6
 *
 * Input:
 *   First linked list: 1->2->3->4->5
 *   Second linked list: 2->3->4
 * Output: 2->3->4
 * </pre>
 */
public class IntersectionOfTwoSortedLinkedList {
    private static Node getIntersectionOfTwoSortedLinkedList(Node a, Node b) {
        Node mainNode = new Node(0);
        Node currentNode = mainNode;
        while (a != null && b != null) {
            if (a.value == b.value) {
                currentNode.next = new Node(a.value);
                currentNode = currentNode.next;
                a = a.next;
                b = b.next;
            } else if (a.value < b.value) {
                a = a.next;
            } else {
                b = b.next;
            }
        }
        mainNode = mainNode.next;
        return mainNode;
    }

    public static void main(String[] args) {
        Node a = null;
        Node b = null;
        Node intersect = null;

        a = Util.createLinkedList(a, 1);
        a = Util.createLinkedList(a, 2);
        a = Util.createLinkedList(a, 3);
        a = Util.createLinkedList(a, 4);
        a = Util.createLinkedList(a, 5);
        a = Util.createLinkedList(a, 6);
        System.out.println("Node a");
        Util.printLinkedList(a);

        b = Util.createLinkedList(b, 2);
        b = Util.createLinkedList(b, 4);
        b = Util.createLinkedList(b, 6);
        b = Util.createLinkedList(b, 8);
        System.out.println("Node b");
        Util.printLinkedList(b);

        intersect = getIntersectionOfTwoSortedLinkedList(a, b);
        System.out.println("After Intersection");
        Util.printLinkedList(intersect);

    }
}
