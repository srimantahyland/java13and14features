package com.java.java13and14;

public class TestThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hllp");

            }
        });

        t.start();

        Thread t1 = new Thread(new PrintNameThread("t1"));
        Thread t2 = new Thread(new PrintNameThread("t2"));

        t1.start();
        t2.start();

    }
}
