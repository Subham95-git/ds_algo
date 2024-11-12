package com.demo.linkedlist;

public class Stack {
    private Node top;
    private int height;
     public Stack(int value){
         Node newNode = new Node(value);
         top = newNode;
         height = 1;    
     }
}
