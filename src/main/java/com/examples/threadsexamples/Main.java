package com.examples.threadsexamples;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread runnableThread = new Thread(new MyRunnable());

        thread1.start(); // Don't call run() directly
        runnableThread.start();
    }

}
