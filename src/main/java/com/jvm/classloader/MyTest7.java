package com.jvm.classloader;

public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("java.lang.String");
        System.out.println(aClass.getClassLoader());

        Class<?> bClass = Class.forName("com.jvm.classloader.C");
        System.out.println(bClass.getClassLoader());

    }
}


class C {

}