package com.jvm.classloader;

public class MyTest4 {
    public static void main(String[] args) {
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());
        System.out.println(myParent4s.getClass().getSuperclass());
        MyParent4[][] myParent4s1 = new MyParent4[1][1];
        System.out.println(myParent4s1.getClass());
        System.out.println(myParent4s1.getClass().getSuperclass());
        System.out.println("======");
        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

        char[] chars = new char[1];
        System.out.println(chars.getClass());
        System.out.println(chars.getClass().getSuperclass());

        boolean[] booleans = new boolean[1];
        System.out.println(booleans.getClass());
        System.out.println(booleans.getClass().getSuperclass());

        short[] shorts = new short[1];
        System.out.println(shorts.getClass());
        System.out.println(shorts.getClass().getSuperclass());

        byte[] bytes = new byte[1];
        System.out.println(bytes.getClass());
        System.out.println(bytes.getClass().getSuperclass());

    }
}

class MyParent4 {
    static {
        System.out.println("MyParent4 static block");
    }
}