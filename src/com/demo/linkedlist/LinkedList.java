package com.demo.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    /*Constructor*/
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /*Prints the linked list*/
    public void printLinkedList(){
        Node temp = head;
        String result = "";
        while (temp != null){
            result = result.concat("(" + temp.value + ") --> ");
            temp = temp.next;
        }
        result += null;
        System.out.println(result);
    }

    public void getHead(){
        System.out.println("HEAD: " + head.value);
    }

    public void getTail(){
        System.out.println("TAIL: " + tail.value);
    }

    public void getLength(){
        System.out.println("LENGTH: " + length);
    }

    /*adds new node at the end*/
    public void append(int val){
        Node newNode = new Node(val);
        if(length == 0){   //Edge case: when there is no node in linked list
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length ++;
    }

    /*adds new node at the end*/
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){  //Edge case: when there is no node in linked list
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    /*Removes last node*/
    public Node removeLast(){
        if(length == 0) return null; //edge case: while there is no node
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){  // edge case while there is only one node
            head = null;
            tail=null;
        }
        return temp;
    }

    /*Remove first element*/
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            temp = null;
        }
        return temp;
    }

    /*Get a node for a given index*/
    public Node get(int index) {
        if (index < 0 || index >= length) return null; //edge case: wrong index
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    /*Set a value for a given index*/
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    /*Insert a node at a given index*/
    public boolean insert(int index, int value){
        if(index< 0 || index>= length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    /*Remove a node from a given index*/
    public Node remove(int index){
        if(index< 0 || index>= length) return null;
        if(index == 0) return removeFirst();
        if(index == length) return removeLast();
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    /*Reverse a linked list*/
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = null;
        for(int i=0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
