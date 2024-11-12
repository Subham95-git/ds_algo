package com.demo.multithreading;

class MyThread1 extends Thread{
    /*
    * start method will look for it*/
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class MyThread2 extends Thread{
    /*
     * start method will look for it*/
    public void run(){
        System.out.println("Thread 2 is running");
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        /*Thread1 will run because start method will look for
        run method which is present, so the these
        will move to the thread from created to runnable method*/
        mt1.start();

        /*Thread2 will run because start method will look for
        run method which is present, so the these
        will move to the thread from created to runnable method*/
        mt2.start();
    }
}
