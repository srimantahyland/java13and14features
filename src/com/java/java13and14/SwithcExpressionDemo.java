package com.java.java13and14;

public class SwithcExpressionDemo {
    public static void main(String[] args) {
        int choice = 2;
        String result = switch(choice) {
            case 1 :
                yield "choice 1";
            default:
                yield "bad choice";

        };
        System.out.println(result);

        String newresult = switch (choice) {
            case 1 -> {
                yield "choice 1";
            }
            default -> {
                yield "bad choice again";
            }
        };

        System.out.println(newresult);
    }
}
