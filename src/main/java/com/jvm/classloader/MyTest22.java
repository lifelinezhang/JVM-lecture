package com.jvm.classloader;

import sun.misc.Launcher;

public class MyTest22 {
    public static void main(String[] args) {
        System.out.println(ClassLoader.class.getClassLoader());
        System.out.println(Launcher.class.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
