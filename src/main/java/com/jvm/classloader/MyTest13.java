package com.jvm.classloader;

import java.util.Random;

interface Parent5 {
    Thread thread = new Thread() {
        {
            System.out.println("interface thread");
        }
    };

    default int getNum() {
        return 0;
    }
}

class Child5 implements Parent5 {

    public static int a = 0;

    static {
        System.out.println("MyChild5");
    }

}


public class MyTest13 {
    public static void main(String[] args) {
        System.out.println(Child5.a);
    }
}
