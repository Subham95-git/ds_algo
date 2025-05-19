package com.demo.linkedlist.singly;

/**
 * Removes duplicate nodes from a sorted singly linked list.
 *
 * <p>This method traverses the linked list and removes consecutive nodes with duplicate values,
 * ensuring that only unique values remain. The resulting list remains sorted in non-decreasing order.</p>
 *
 *
 * <pre>
 * Example 1:
 * Input: 11 -> 11 -> 11 -> 21 -> 43 -> 43 -> 60
 * Output: 11 -> 21 -> 43 -> 60
 *
 * Example 2:
 * Input: 5 -> 10 -> 10 -> 20
 * Output: 5 -> 10 -> 20
 */
public class RemoveDuplicateFromSortedLinkedList {
    private static Node removeDuplicate(Node head){
        Node currentNode = head;
        while (currentNode != null && currentNode.next != null){
            if(currentNode.value == currentNode.next.value){
                Node nextOfNext = currentNode.next.next;
                currentNode.next = nextOfNext;
            }else{
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Create a sorted linked list:
        // 11->11->11->13->13->20
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(13);
        head.next.next.next.next.next = new Node(20);

        Node uniqueNodes = removeDuplicate(head);
        Util.printLinkedList(uniqueNodes);
    }
}
