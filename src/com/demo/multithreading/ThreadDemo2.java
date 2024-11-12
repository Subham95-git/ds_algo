package com.demo.multithreading;

class MyThread3 extends Thread{
    /*
    * start method will look for it*/
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class MyThread4 extends Thread{

    public void show(){
        System.out.println("Thread 2");
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread3 mt1 = new MyThread3();
        MyThread4 mt2 = new MyThread4();

        /*Thread1 will run because start method will look for
        run method which is present, so the these
        will move to the thread from created to runnable method*/
        mt1.start();

        /*Thread2 will NOT run because start method will look for
        run method which is NOT present, so the these
        will NOT move to the thread from created to runnable method*/
        mt2.start();
    }
}
