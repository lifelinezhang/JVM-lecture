package com.jvm.classloader;

public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.i);
    }
}

class MyParent2 {
    public static final String str = "hello world";

    public static final short s = 127;

    public static final int i = 6;

    static {
        System.out.println("MyParent2 static block");
    }

}