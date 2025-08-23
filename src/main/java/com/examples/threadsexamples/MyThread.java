package com.examples.threadsexamples;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread runnning: " + Thread.currentThread().getName());
    }

}