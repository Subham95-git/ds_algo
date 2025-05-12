package com.demo.linkedlist;

/**
 * <li>Given a singly linked list, the task is to find the middle of
 * the linked list. If the number of nodes are even, then there would
 * be two middle nodes, so return the second middle node.</li>
 *
 * <li><p><strong>Input: </strong>linked list: 1->2->3->4->5
 * <br/><strong>Output:</strong> 3
 * <br/><strong>Explanation:</strong> There are 5 nodes in the linked list and there is one
 * middle node whose value is 3.</p></li>
 *
 * <li><p><strong>Input: </strong>linked list = 10 -> 20 -> 30 -> 40 -> 50 -> 60
 * <br/><strong><strong>Output:</strong> 40
 * <br/><strong>Explanation:</strong> There are 6 nodes in the linked list, so we have two middle nodes:
 * 30 and 40, but we will return the second middle node which is 40.</p></li>
 *
 * <li>The idea is to traversing the entire linked list once to count the total
 * number of nodes. After determining the total count, traverse the list again
 * and stop at the (count/2)th node to return its value. This method requires two
 * passes through the linked list to find the middle element.</li>
 * */
public class FindMiddleOfALinkedList {
    /*public static int findMiddleNode(Node head){

    }*/

}
