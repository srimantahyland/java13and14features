package com.java.java13and14;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    public CollectionTest(){

    }

    public CollectionTest(int value){

    }

    public CollectionTest(int value, int value2){

    }


    static int i = 90;
    int objProp = 9;

    void changeI(int value){
        i = value;
        objProp = value;
    }

    /*void method1(){}*/
    static void method1(){
        i++;
    }

    int getI(){
        return i;
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        int i = 0;
        i = 30;
        System.out.println(CollectionTest.i);
        CollectionTest.i = 98;
        System.out.println(CollectionTest.i);

        CollectionTest ct1 = new CollectionTest();
        CollectionTest ct2 = new CollectionTest(1);
         ct1.changeI(120);

        System.out.println(CollectionTest.i);

         CollectionTest.method1();

    }
}
