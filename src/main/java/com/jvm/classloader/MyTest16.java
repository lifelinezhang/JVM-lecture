package com.jvm.classloader;

public class MyTest16 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        System.out.println(strs.getClass());
        System.out.println(strs.getClass().getClassLoader());
        System.out.println("======");
        MyTest16[] myTest16s = new MyTest16[2];
        System.out.println(myTest16s.getClass());
        System.out.println(myTest16s.getClass().getClassLoader());
        System.out.println("======");
        int[] ints = new int[2];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getClassLoader());
        System.out.println("======");
        Integer[] ints2 = new Integer[2];
        System.out.println(ints2.getClass());
        System.out.println(ints2.getClass().getClassLoader());
    }
}

