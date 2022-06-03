package com.java.java13and14;

public class PrintNameThread implements Runnable{

    String name = "tep";

    public PrintNameThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "is printing " + i);
        }
        System.out.println("name is + " + name);
        System.out.println(Thread.currentThread().getName());
    }
}
