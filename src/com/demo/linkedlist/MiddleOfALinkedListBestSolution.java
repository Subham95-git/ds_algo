package com.demo.linkedlist;

/**
 * Given a singly linked list, the task is to find the middle of the linked list.
 * If the number of nodes are even, then there would be two middle nodes, so return the second middle node.
 *
 * <ul>
 * <li><b>Definition:</b> Finds the middle node of a singly linked list. If the list has an even number of nodes, returns the second middle node.</li>
 * <li><b>Algorithm:</b> We can use the Hare and Tortoise Algorithm to find the middle of the linked list. Traverse the linked list using a slow pointer (`slow_ptr`) and a fast pointer (`fast_ptr`). Move the slow pointer to the next node (one node forward) and the fast pointer to the next of the next node (two nodes forward). When the fast pointer reaches the last node or `NULL`, then the slow pointer will reach the middle of the linked list. In the case of an odd number of nodes in the linked list, `slow_ptr` will reach the middle node when `fast_ptr` reaches the last node. In the case of an even number of nodes in the linked list, `slow_ptr` will reach the second middle node when `fast_ptr` becomes `NULL`.</li>
 * <li><b>Example 1:</b>
 * <ul>
 * <li><b>Input:</b> linked list: 1->2->3->4->5</li>
 * <li><b>Output:</b> 3</li>
 * <li><b>Explanation:</b> There are 5 nodes in the linked list and there is one middle node whose value is 3.</li>
 * </ul>
 * </li>
 * <li><b>Example 2:</b>
 * <ul>
 * <li><b>Input:</b> linked list = 10 -> 20 -> 30 -> 40 -> 50 -> 60</li>
 * <li><b>Output:</b> 40</li>
 * <li><b>Explanation:</b> There are 6 nodes in the linked list, so we have two middle nodes: 30 and 40, but we will return the second middle node which is 40.</li>
 * </ul>
 * </li>
 * </ul>
 */
public class MiddleOfALinkedListBestSolution {
    private static int getMiddleOfANode(Node head){
        Node fast_ptr = head;
        Node slow_ptr = head;

        while(fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        return slow_ptr.value;
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
