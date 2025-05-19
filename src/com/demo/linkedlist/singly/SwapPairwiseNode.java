package com.demo.linkedlist.singly;

/**
 * Swaps the elements of a singly linked list pairwise.
 * <p>
 * Given the head of a singly linked list, this method traverses the list and swaps
 * the data of adjacent nodes in pairs. If the list has an odd number of nodes,
 * the last node remains unchanged.
 * </p>
 *
 * <p>
 * <b>Examples:</b>
 * <pre>
 * Input : 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
 * Output: 2 -> 1 -> 4 -> 3 -> 6 -> 5 -> NULL
 *
 * Input : 1 -> 2 -> 3 -> 4 -> 5 -> NULL
 * Output: 2 -> 1 -> 4 -> 3 -> 5 -> NULL
 * </pre>
 * </p>
 *
 */
public class SwapPairwiseNode {
    private static Node swapNode(Node head) {
        Node currentNode = head;
        while(currentNode != null && currentNode.next != null){
            int temp = currentNode.value;
            currentNode.value = currentNode.next.value;
            currentNode.next.value = temp;

            currentNode = currentNode.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Before swap");
        Util.printLinkedList(head);

        System.out.println("After swap");
        Util.printLinkedList(swapNode(head));
    }
}
