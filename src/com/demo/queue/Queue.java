package com.demo.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public  Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First: " + first);
    }

    public void getLast(){
        System.out.println("Last: " + last);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

}
