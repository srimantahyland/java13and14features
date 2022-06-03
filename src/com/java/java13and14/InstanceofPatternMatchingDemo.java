package com.java.java13and14;

public class InstanceofPatternMatchingDemo {
    public static void main(String[] args) {
        Object obj = get();
        if (obj instanceof String str){
            System.out.println(str);
        }


    }
    static Object get(){
        return "bingo";
    }
}
