package com.jvm.classloader;

import java.util.Random;
import java.util.UUID;

public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyParent5.a);
    }
}

interface MyParent5 {
    int a = 3;
}

class MyChild5 implements MyParent5 {
    public static final int b = new Random().nextInt(3);

    static {
        System.out.println("MyChild5");
    }

}

