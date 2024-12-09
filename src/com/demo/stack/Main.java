package com.demo.stack;

public class Main {
    public static void main(String[] args) {
        Stack meStack = new Stack(4);
        meStack.getTop();
        meStack.getHeight();
        meStack.printStack();
        meStack.push(3);
        meStack.push(2);
        meStack.getTop();
        meStack.getHeight();
        meStack.printStack();
        System.out.println(meStack.pop().value);
        meStack.getTop();
        meStack.getHeight();
        meStack.printStack();
    }
}
