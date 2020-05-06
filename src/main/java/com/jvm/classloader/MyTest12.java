package com.jvm.classloader;

class CL {
    static {
        System.out.println("class CL");
    }
}

public class MyTest12 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = loader.loadClass("com.jvm.classloader.CL");
        System.out.println(aClass);
        System.out.println("=========");
        aClass = Class.forName("com.jvm.classloader.CL");
        System.out.println(aClass);
    }
}
