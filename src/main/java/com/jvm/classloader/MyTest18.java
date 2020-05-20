package com.jvm.classloader;

public class MyTest18 {
    public static void main(String[] args) throws Exception {
        MyTest17 loader1 = new MyTest17("loader1");
        loader1.setPath("C:/Users/lifeline张/Desktop/");
        Class<?> aClass = loader1.loadClass("com.jvm.classloader.User");
        System.out.println("aclass: " + aClass.hashCode());
        Object o = aClass.newInstance();
    }
}
